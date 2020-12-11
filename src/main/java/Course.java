public class Course {
    private String id;
    private String name;
    private Professor lecturer;
    private int credit;

    private Course(){}
    public Course(String id, String name, Professor lecturer, int credit){
        this.id = id;
        this.name = name;
        this.lecturer = lecturer;
        this.credit = credit;
    }

    public String getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public void setLecturer(Professor newLecturer){
        lecturer = newLecturer;
    }
    public Professor getLecturer(){
        return lecturer;
    }

    public int getCredit(){
        return credit;
    }
    public void setCredit(int newCredit){
        credit = newCredit;
    }
}
