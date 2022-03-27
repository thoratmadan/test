package banking;

/**
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction {
    private Long accountNumber;
    private Bank bank;
    private int pin;

    /**
     * @param bank          The bank where the account is housed.
     * @param accountNumber The customer's account number.
     * @param attemptedPin  The PIN entered by the customer.
     * @throws Exception Account validation failed.
     */
    public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
        this.accountNumber = accountNumber;
        this.bank = bank;
        String strPin = String.valueOf(attemptedPin);
        if (validatePin(strPin)) {
            this.pin = attemptedPin;
        } else {
            throw new Exception();
        }
    }

    boolean validatePin(String pin) {
        int n = pin.length();
        for (int i = 1; i < n; i++)
            if (pin.charAt(i) != pin.charAt(0))
                return false;

        for (int i = 1; i < n; i++) {
            if (pin.charAt(i) != '9') {
                break;
            }
            return false;
        }

        return true;
    }

    public double getBalance() {
        return this.bank.getBalance(accountNumber);
    }

    public void credit(double amount) {
        this.bank.credit(accountNumber, amount);
    }

    public boolean debit(double amount) {
        return bank.debit(this.accountNumber, amount);
    }
}
