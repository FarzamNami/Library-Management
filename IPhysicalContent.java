public interface IPhysicalContent {
	
	
	static IPhysicalContent createPhysicalContent(EContent Type ) {
		if(Type == EContent.book){
			return new PhisycalBook();
		}if(Type == EContent.Magazine){
			return new PhisycalBook();
		}
		return null;
	}
	
} 