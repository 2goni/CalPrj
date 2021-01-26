
public class CalVO {

	private int op1;
	private String op;
	private int op2;

	public CalVO(String[] args) {
		op1 = Integer.parseInt(args[0]);
		op = args[1];
		op2 = Integer.parseInt(args[2]);

	}

	public int getOp1() {
		return op1;
	}

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public int getOp2() {
		return op2;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}

}
