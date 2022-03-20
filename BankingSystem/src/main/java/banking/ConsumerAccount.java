package banking;

public class ConsumerAccount extends Account {
    private Person person;

    public ConsumerAccount(Person person, Long accountNumber, int pin, double startingDeposit) {
        super(person, accountNumber, pin, startingDeposit);
    }


}
