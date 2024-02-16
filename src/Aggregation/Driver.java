package Aggregation;
public class Driver {
    public static void main(String[] args){
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Bob", "Dylan", "1-2344");

        Textbook txtbook1 = new Textbook("Clean Code", "John Doe", "X Publisher");
        Textbook txtbook2 = new Textbook("Design Patter", "Jane Smith", "Y Publisher");

        Course course = new Course("CS4800:Software Engineering", instructor1, txtbook1 );
        System.out.println("One\n" + course.display());

        course.addInstructor(instructor2);
        course.addTextbook(txtbook2);
        System.out.println("Two\n" + course.display());

    }
}
