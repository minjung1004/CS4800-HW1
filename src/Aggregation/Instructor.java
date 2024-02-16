package Aggregation;

public class Instructor {
    private String instructorFirstName;
    private String instructorLastName;
    private String officeNumber;

    public Instructor(String instructorFirstName, String instructorLastName, String officeNumber){
        this.instructorFirstName = instructorFirstName;
        this.instructorLastName = instructorLastName;
        this.officeNumber = officeNumber;
    }

    public String getInstructorFirstName(){
        return instructorFirstName;
    }

    public String getInstructorLastName(){
        return instructorLastName;
    }

    public String getOfficeNumber(){
        return officeNumber;
    }
}
