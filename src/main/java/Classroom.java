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

    public void addStudent(Student newStudent){
        /*ArrayList<Student> list = new ArrayList<Student>(Arrays.asList(participants));
        list.add(newStudent);
        participants = list.toArray(participants);*/
        /*for (Student student : participants){
            if (student.getID() == newStudent.getID()){
            }
        }
        int index = 0;
        if(index < 4){    
            participants[index++] = newStudent;
        }*/
        /*int index = 0;
        if(index < 4) { 
            //Student student = new Student();
            participants[index] = newStudent;
            index++;
        }*/
        participants = new Student[4];
        
        for (int i = 0; i < 4; i++){
            
            participants[i] = newStudent;
        }
    }

    public String getParticipantsEmail(){
        /*String email = "";
        for(int i = 0; i < participants.length; i++){
            if(i == (participants.length-1)){
                email = email.concat(participants[i].getID()).concat("@student.hsrw");
            }
            else{
                email = email.concat(participants[i].getID()).concat("@student.hsrw, ");
            }                                           
        }

        return email;*/
        /*ArrayList<Student> list = new ArrayList<Student>(Arrays.asList(participants));
        String emails = "";
        for (int i=0; i < list.size();i++){
            emails = emails + list.get(i).getFQUN() + ", ";
        }
        return emails.substring(0, emails.length() - 2);*/
        String str = "";
           
        for(int i=0; i<participants.length; i++){
            if(i == (participants.length-1)){
                str += (participants[i].getID() + "@student.hsrw");
            }

            else if (i == (participants.length-1)){

            str += "";

        }
                                         
          else{

          str +=( participants[i].getID() + "@student.hsrw, ");

          }
               
        }
        return str;
    }
    
    public int getTotalPaticipants(){
        return participants.length;
    }
}
