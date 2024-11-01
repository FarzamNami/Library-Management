public class PhisycalBook  extends Book implements IPhysicalContent,IBorrowable{
	private ESizeType m_sizeType;
	private double m_healthState;
	
	
	
	public PhisycalBook() {
		super();
		m_sizeType = ESizeType.UNknown;
		m_healthState = 1;

	}
	
	
}

