
public class Cal {

	ICal ic;
	CalVO vo;

	public Cal(String[] args) {
		ic = new CalImpl();
		vo = new CalVO(args);
		ic.doCal(vo);
	}
}
