import java.util.Date;

public abstract class Person extends Entity{

    private String m_firstName;
    private String m_lastName;
    private Date m_birthDate;
    private EGender m_gender;
    
    public Person() {

        super();
        m_firstName = "";
        m_lastName = "";
        m_birthDate = new Date();
        
	}


}	
