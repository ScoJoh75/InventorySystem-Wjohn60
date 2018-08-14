package model;

public class Outsourced extends Part {
    private String companyName;

    public Outsourced(int partID, String name, double price, int instock, int min, int max, String companyName) {
        setPartID(partID);
        setName(name);
        setPrice(price);
        setInStock(instock);
        setMin(min);
        setMax(max);
        setCompanyName(companyName);
    } // end initializer

    public String getCompanyName() {
        return companyName;
    } // end getCompanyName

    private void setCompanyName(String companyName) {
        this.companyName = companyName;
    } // end setCompanyName
} // end Outsourced
