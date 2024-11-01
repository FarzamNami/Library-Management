import java.util.Date;

public class Author {

    private String m_firstName;
    private String m_lastName;

    private Date m_birthDate;
    private EGender m_gender;

    public Author() {

        m_firstName = "";
        m_lastName = "";

        m_birthDate = new Date();
        
    }

}
