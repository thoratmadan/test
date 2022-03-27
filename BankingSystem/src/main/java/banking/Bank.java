package banking;

import java.util.LinkedHashMap;
import java.util.Random;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
    private LinkedHashMap<Long, Account> accounts;
	Random rand = new Random();
    public Bank() {
        accounts = new LinkedHashMap<>();
    }

    private Account getAccount(Long accountNumber) {
        return accounts.get(accountNumber);
    }

    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
        Account account = new CommercialAccount(company, null, pin, startingDeposit);
        accounts.put(account.getAccountNumber(),account);
        return account.getAccountNumber();
    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        Account account = new ConsumerAccount(person, null, pin, startingDeposit);
        accounts.put(account.getAccountNumber(),account);
        return account.getAccountNumber();
    }

    public boolean authenticateUser(Long accountNumber, int pin) {
        // complete the function
        return true;
    }

    public double getBalance(Long accountNumber) {
        return this.getAccount(accountNumber).getBalance();
    }

    public void credit(Long accountNumber, double amount) {
        Account account= this.getAccount(accountNumber);
        account.creditAccount(amount);
    }

    public boolean debit(Long accountNumber, double amount) {
        Account account= this.getAccount(accountNumber);
        return account.debitAccount(amount);
    }
}
