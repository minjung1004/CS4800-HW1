package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Instructor> instructorList = new ArrayList<>();
    private List<Textbook> textbookList = new ArrayList<>();

    public Course(String courseName, Instructor instructorList, Textbook textbookList){
        this.courseName = courseName;
        this.instructorList.add(instructorList);
        this.textbookList.add(textbookList);
    }

    public String getCourseName(){
        return courseName;
    }

    public List<Instructor> getInstructorList(){
        return instructorList;
    }

    public void addInstructor(Instructor instructor){
        this.instructorList.add(instructor);
    }

    public List<Textbook> getTextbookList(){
        return textbookList;
    }

    public void addTextbook(Textbook textbook){
        this.textbookList.add(textbook);
    }

    public String display(){
        String output = "Course Name: " + courseName;
        for (Instructor instructor : instructorList){
            output +=  "\nInstructor: " + instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName();
        }
        for (Textbook textbook : textbookList){
            output += "\nTextbook Title: " + textbook.getTxtbookTitle() + "\nTextbook Author: " + textbook.getTxtbookAuthor();
        }
        return output;
    }

}
