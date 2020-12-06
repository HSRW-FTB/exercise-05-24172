import java.util.Scanner;
public class TestCourse {
    public static void main(String[] args) {
        Professor professor1 = new Professor("abc", "A", "Bc");

        Course oop = new Course ("EL4059", "OOP", professor1, 60);

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter name:");
        String name = input.next();

        System.out.println("Enter professor:");
        String lecturer = input.next();

        System.out.println("Enter credit: ");
        int credit = input.nextInt();
        input.close();

        
    }
}