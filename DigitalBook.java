import java.util.Date;

public class DigitalBook extends Book implements IDigitalContetnt,IBorrowable{
	private int  m_size;
	private EFileType  m_fileType;
	private Date  m_dateCreated;                
	
	public DigitalBook() {
		super();
		m_size = 0;
		m_fileType = EFileType.jpg;
		m_dateCreated = null;       					
	}
}
 