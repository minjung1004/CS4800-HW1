package Inheritance;

public class CommisionEmployee extends Employee {
    private int commisionRate;
    private int grossSales;

    public CommisionEmployee(String firstName, String lastName, String SSN, int commisionRate, int grossSales) {
        super(firstName, lastName, SSN);
        this.commisionRate = commisionRate;
        this.grossSales = grossSales;
    }
    public int getCommisionRate(){
        return commisionRate;
    }
    public int getGrossSales(){
        return grossSales;
    }
}
