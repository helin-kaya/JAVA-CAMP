public class Company extends Customer {
    public String TaxNumber;
    public String CompanyName;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public void setTaxNumber(String taxNumber) {
        TaxNumber = taxNumber;
    }

    public String getTaxNumber() {
        return TaxNumber;
    }
}
