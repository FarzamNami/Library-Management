import java.util.ArrayList;
import java.util.Date;

public abstract class Book implements IBook{
	
	private static int bookCount;
	
	private int	m_id;
	private String m_code;
	private String m_title;
	private Publisher m_publisher;;
	private EBookGanre m_ganre;
	private ArrayList<Author> m_authors;
	private Date m_publishedDate;         
	private int m_pageCount;
	private ELang m_lang;
	
	static {
		bookCount = 0;
	}
    public Book(){
    	
    	bookCount++;
    	m_id = bookCount;
    	
	    m_code =  "";
	    m_title =  "";
	    m_publisher =  new Publisher();
	    m_ganre =  EBookGanre.Unknown;
	    m_authors =  new ArrayList<Author>();
	    m_publishedDate	=  new Date();								
	    m_pageCount =  0;
	    m_lang =  ELang.FA;
	
    }
    
    public int GetID() {
    	return m_id;
    }
    
    
    

}
