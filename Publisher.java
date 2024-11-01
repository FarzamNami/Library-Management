public class Publisher {
    private String 	m_name  ;
    private ECountry m_country  ;
    public Publisher() {
		m_name = "";
		m_country = ECountry.Turkey;
	}
    
    public void initialize(String name , ECountry country) {
    	m_name  = name;
    	m_country = country;
    }
}
