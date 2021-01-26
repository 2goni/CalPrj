class CalImpl implements ICal {

	int result;

	@Override
	public void doCal(CalVO vo) {
		int op1 = vo.getOp1();
		String op = vo.getOp();
		int op2 = vo.getOp2();
		if (op.equals("add")) {
			result = op1 + op2;
		} else if (op.equals("sup")) {
			result = op1 - op2;
		} else if (op.equals("mul")) {
			result = op1 * op2;
		} else if (op.equals("div")) {
			result = op1 / op2;
		}
		System.out.println(result);
	}
}
