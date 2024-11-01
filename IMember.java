import java.util.Date;

public interface IMember {
	
	Date getExpireDate();
	
	
	static IMember createMember(boolean isMember) {
		
		
		if (isMember) {
			return new Member();
			
		}else {
			return new Employee();
		}
	}
}
