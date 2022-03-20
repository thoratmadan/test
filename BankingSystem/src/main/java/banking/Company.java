package banking;

public class Company extends AccountHolder {
    private String companyName;
    private int taxId;
    private int idNumber;

    public Company(String companyName, int taxId, int idNumber) {
        super(idNumber);
        this.companyName = companyName;
        this.taxId = taxId;
    }

    public String getCompanyName() {
        return this.companyName;
    }
}
