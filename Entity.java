import java.util.ArrayList;

public class Entity implements IEntity{
	
	private String 	m_hashCode;
	private ArrayList<String>  m_searchHistory;
	
	public Entity() {
		
		m_hashCode = "";
		m_searchHistory = new ArrayList<String>();
		
	}
}
