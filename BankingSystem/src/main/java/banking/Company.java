package banking;

public class Company extends AccounntHolder {
	private String companyName;
	private int taxId;

	public Company(String companyName, int taxId) {
		this.companyName=companyName;
		this.taxId =taxId;
	}

	public String getCompanyName() {
        return this.companyName;
	}
}
