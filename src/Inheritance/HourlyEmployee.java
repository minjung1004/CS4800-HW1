package Inheritance;

public class HourlyEmployee extends Employee {
    private int wage;
    private int numberOfHoursWorked;

    public HourlyEmployee(String firstName, String lastName, String SSN, int wage, int numberOfHoursWorked) {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
    public int getWage(){
        return wage;
    }
    public int getNumberOfHoursWorked(){
        return numberOfHoursWorked;
    }
}
