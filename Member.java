import java.util.Date;

public class Member extends Person implements IMember{

    private int m_id;

    private String m_userNmae;
    private String m_passWord;

    private Date m_joindDate;

    private String m_email;
    private String m_phone;
    String m_hint;
    public Member() {
		
        super();
        m_id = 0;
        m_userNmae = "";
        m_passWord = "";
        m_joindDate = new Date();
        m_email = "";
        m_phone = "";

	}
    
    public Date getExpireDate() {

        return null;
    }

}
