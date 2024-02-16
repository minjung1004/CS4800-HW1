package Inheritance;

import java.util.WeakHashMap;

public class Driver {

    // print each of the classes above and populate with the following info:
    // First Name, LastName, SSN, Weekly Salary, wage, hours worked, cmomision rate, gross salary, base salary

    public static void main(String[] args) {
        SalariedEmployee employee_1 = new SalariedEmployee("Joe", "Jones", "111-11-1111",2500);
        HourlyEmployee employee_2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25,32);
        HourlyEmployee employee_3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommisionEmployee employee_4 = new CommisionEmployee("Nicole", "Doir", "444-44-4444", 15,50000);
        SalariedEmployee employee_5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee employee_6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommisionEmployee employee_7 = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        System.out.println(
                 "First name \t Last name \t SSN \t\t\t Weekly Salary \t\t Wage \t Hours Worked \t Com Rate \t Gross Salary \t Base Salary"
        );

        System.out.println(
                employee_1.getFirstName() + " \t\t " +
                employee_1.getLastName() + " \t\t " +
                employee_1.getSSN() + " \t $" + employee_1.getWeeklySalary()
        );

        System.out.println(
                employee_2.getFirstName() + " \t " +
                        employee_2.getLastName() + " \t\t " +
                        employee_2.getSSN() + " \t\t\t\t\t\t $" +
                        employee_2.getWage() + " \t " +
                        employee_2.getNumberOfHoursWorked()
        );

        System.out.println(
                employee_3.getFirstName() + " \t\t " +
                        employee_3.getLastName() + " \t\t " +
                        employee_3.getSSN() + " \t\t\t\t\t\t $" +
                        employee_3.getWage() + " \t " +
                        employee_3.getNumberOfHoursWorked()
        );

        System.out.println(
                employee_4.getFirstName() + " \t\t " +
                        employee_4.getLastName() + " \t\t " +
                        employee_4.getSSN() + " \t\t\t\t\t\t\t\t\t\t\t\t " +
                        employee_4.getCommisionRate() + "% \t\t $" +
                        employee_4.getGrossSales()
        );

        System.out.println(
                employee_5.getFirstName() + " \t\t " +
                        employee_5.getLastName() + " \t " +
                        employee_5.getSSN() + " \t $" + employee_5.getWeeklySalary()
        );

        System.out.println(
                employee_6.getFirstName() + " \t\t " +
                        employee_6.getLastName() + " \t " +
                        employee_6.getSSN() + " \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t $" + employee_6.getBaseSalary()
        );

        System.out.println(
                employee_7.getFirstName() + " \t\t " +
                        employee_7.getLastName() + " \t " +
                        employee_7.getSSN() + " \t\t\t\t\t\t\t\t\t\t\t\t " +
                        employee_7.getCommisionRate() + "% \t\t $" +
                        employee_7.getGrossSales()
        );


    }


}
