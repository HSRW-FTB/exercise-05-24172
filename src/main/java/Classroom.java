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

    public void addStudent(Student student)
    {
        
        for(int i=0; i<participants.length;i++){
            
            if(participants[i]== null ){
                participants[i]= student;
                i = participants.length;
            }
            }
        
    
    }

    public String getParticipantsEmail()
    {
      String str= "";
      String hsrw= "@student.hsrw, ";
      String hsrwend= "@student.hsrw";
           
        int k=0;
        for(int z=0; z<participants.length; z++){
                 if(participants[z]!=null) k++;

        }
        for(int i=0; i<k; i++){
         if(i==k-1){
            
          str= str.concat(participants[i].getID()).concat(hsrwend);
                                         }
      else
      {
          str= str.concat(participants[i].getID()).concat(hsrw);
          }
               
                                                     }
      return str;
                              

    }
    
    public int getTotalPaticipants(){
        return participants.length;
    }
}
