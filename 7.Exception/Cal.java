
public class Cal {

	ICal ic;
	CalVO vo;

	public Cal(String[] args) {
		ic = new CalImpl();
		vo = new CalVO(args);
		try {
			ic.doCal(vo);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
