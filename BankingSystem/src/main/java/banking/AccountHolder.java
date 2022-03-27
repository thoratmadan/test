package banking;

import java.util.Random;

public abstract class AccountHolder {
    private int idNumber;
    // create instance of Random class
    Random rand = new Random();
    /**
     * @param idNumber The government-issued ID used during account setup.
     */
    public AccountHolder(int idNumber) {
        this.idNumber = idNumber;
    }
    /**
     */
    public AccountHolder() {
        this.idNumber = rand.nextInt(1000);
    }
    /**
     * @return private int {@link AccountHolder#idNumber}
     */
    public int getIdNumber() {
        return this.idNumber;
    }
}
