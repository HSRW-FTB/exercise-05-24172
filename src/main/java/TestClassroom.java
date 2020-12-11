import java.util.*;

public class TestClassroom {
        public static void main(String[] args) {
            GregorianCalendar date = new GregorianCalendar(1990, 01, 01);

            Student student1 = new Student("A", "B");   
            Student student2 = new Student("C", "D");
            Student student3 = new Student("E", "F", date.getTime());
            Student student4 = new Student("G", "H", date.getTime());
            Professor prof1 = new Professor("xye", "X", "Ye");

            Course oop = new Course("EL-2309", "Object Oriented Programming", prof1, 5);
            Classroom oop_class = new Classroom(oop, "Webex");
            
            oop_class.addStudent(student1);
            oop_class.addStudent(student2);
            oop_class.addStudent(student3);
            oop_class.addStudent(student4);

            System.out.println(oop_class.getTerm());
            System.out.println(oop_class.getID());
            System.out.println(oop_class.getParticipantsEmail());



        }

}