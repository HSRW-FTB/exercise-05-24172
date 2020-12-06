import java.util.Date;
public abstract class User {
    private String id;
    private String lastname;
    private String firstname;
    private Date birthdate;
    private Domain domain;

    protected User(){}
    protected User(String newID, Domain newDomain, String newFirstname, String newLastname){
        id = newID;
        domain = newDomain;
        firstname = newFirstname;
        lastname = newLastname;

    }
    protected User(String newID, Domain newDomain, String newFirstname, String newLastname, Date newBirthdate){
        id = newID;
        domain = newDomain;
        firstname = newFirstname;
        lastname = newLastname;
        birthdate = newBirthdate;
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String newFirstname){
        firstname = newFirstname;
    }

    public String getLastname(){
        return lastname;
    }
    public void setLastname(String newLastname){
        lastname = newLastname;
    }
    
    public String getID(){
        return id;
    }

    public Date getBirthDate(){
        return birthdate;
    }
    public void setBirthDate(Date newBirthdate){
        birthdate = newBirthdate;
    }

    public Domain getDomain(){
        return domain;
    }

    public String getFQUN(){
        switch (domain){
            case STAFF: return getID() + "@staff.hsrw";
            case STUDENT: return getID() + "@student.hsrw";
            default: return "";
        }
    }
}
