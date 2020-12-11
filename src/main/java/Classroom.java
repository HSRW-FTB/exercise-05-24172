import java.util.*;
public class Classroom {
    private String id;
    private Course course;
    private Student[] participants = new Student[10];
    private int index = -1;
    private String room;
    private String term;

    private Classroom(){}
    public Classroom(Course newCourse, String theRoom){
        course = newCourse;
        room = theRoom;
    }
    public Classroom(Course newCourse, String theRoom, Date date){
        course = newCourse;
        room = theRoom;
    }

    public Course getCourse(){
        return course;
    }
    
    public String getRoom(){
        return room;
    }
    public void setRoom(String theRoom){
        room = theRoom;
    }

    public String getTerm(){
        Calendar calendar = new GregorianCalendar();
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        if(month > 2 && month < 10)
        {
            term = "SS" + year;
            return term;
        }
        else
        {
            term = "WS" + year + "/" + ((year % 2000) + 1);
            return term;
        }
    }

    public String getID(){
        id = course.getID();
        return id + "-" + term;
    }

    public void addStudent(Student newStudent){
        this.index++;
        this.participants[this.index] = newStudent;
    }

    public String getParticipantsEmail(){
        String email = "";
        int i;
        for (i = 0; i <= index; i ++) {
            email += participants[i].getFQUN() + ", ";
        }
        email = email.substring(0, email.length()-2);
        return email;
    }
    
    public int getTotalPaticipants(){
        int total = 0;
        int i;
        for (i = 0; i <= index; i++) {
            total++;
        }
        return total;
    }
}
