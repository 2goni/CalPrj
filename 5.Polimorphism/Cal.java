
public class Cal {
	
	ICal ic; 
	
	public Cal(String[] args) {
		ic =  new CalImpl();
		ic.doCal(args);
	}
}
