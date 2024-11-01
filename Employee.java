public class Employee extends Member implements IEmployee{
	
	private EEmployeePosition m_position;
	private String m_employeeId;
	
	
	public Employee() {
		
		super();
		
		m_position = EEmployeePosition.keeper;
		m_employeeId = ""; 
		
	}
}
