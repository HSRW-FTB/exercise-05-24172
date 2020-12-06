import java.util.*;
public class Classroom {
    private String id;
    private Course course;
    private Student[] participants;
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

    public void addStudent(Student student){
        for (int i = 0; i < 4; i++){
            participants[i] = student;
        }
    }

    public String getParticipantsEmail(){
      String email = "";
        for(int i = 0; i < participants.length; i++){
            if(i == (participants.length-1)){
                email = email.concat(participants[i].getID()).concat("@student.hsrw");
            }
            else{
                email = email.concat(participants[i].getID()).concat("@student.hsrw, ");
            }                                           
        }

        return email;
    }
    
    public int getTotalPaticipants(){
        return participants.length;
    }
}
