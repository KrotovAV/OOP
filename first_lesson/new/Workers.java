import java.util.Date;
import java.util.List;

public class Workers {

    int id;
    public String foolName;
    public Date date;

    public String address;
    public String jobTitle;
    public String accessLevel;
    public int workExperience;


    public Workers(int id, String foolName, Date date, String address, String jobTitle, String accessLevel,
            int workExperience) {
        this.id = id;
        this.foolName = foolName;
        this.date = date;
        this.address = address;
        this.jobTitle = jobTitle;
        this.accessLevel = accessLevel;
        this.workExperience = workExperience;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getFoolName() {
        return foolName;
    }


    public void setFoolName(String foolName) {
        this.foolName = foolName;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getJobTitle() {
        return jobTitle;
    }


    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public String getAccessLevel() {
        return accessLevel;
    }


    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }


    public int getWorkExperience() {
        return workExperience;
    }


    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }


    @Override
    public String toString() {
        return "Workers [id=" + id + ", foolName=" + foolName + ", date=" + date + ", address=" + address
                + ", jobTitle=" + jobTitle + ", accessLevel=" + accessLevel + ", workExperience=" + workExperience
                + "]";
    }

    

    

        

    
    
}
