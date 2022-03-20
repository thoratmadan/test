package banking;

public class ConsumerAccount extends Account {
	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		private Person person;

	public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
			super(company)
		}

		/**
		 * @param person The authorized user to add to the account.
		 */
		protected void addAuthorizedUser(Person person) {
			this.authorizedUsers.add(person);
		}

		/**
		 * @param person
		 * @return true if person matches an authorized user in {@link #authorizedUsers}; otherwise, false.
		 */
		public boolean isAuthorizedUser(Person person) {
			return this.authorizedUsers.contains(person);
		}
	}

}
