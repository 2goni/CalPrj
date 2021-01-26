
public class Cal {

	ICalService ic;
	CalVO vo;

	public Cal(String[] args) {
		ic = new CalService();
		vo = new CalVO(args);
		try {
			ic.doCal(vo);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
