package th.mfu.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//TODO: add entity annotation
@Entity
public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //TODO: add attributes and annotation for Id, GeneratedValue
    // - id (Long)
    // - name (String)
    // - date (Date)
    private Long id;
    private String title;
    private Date date; 

    //TODO: generate getter/setter for all attributes
    public Concert() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    } 

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
   

    
}
