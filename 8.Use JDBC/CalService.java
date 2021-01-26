class CalService implements ICalService {

	@Override
	public void doCal(CalVO vo) throws Exception {
		int op1 = vo.getOp1();
		String op = vo.getOp();
		int op2 = vo.getOp2();
		if (op.equals("add")) {
			if (op1 == 0 || op2 == 0) {
				throw new AddZeroException("0이 입력되었습니다 결과는" + Math.max(op1, op2) + "입니다");
			} else {
				vo.setResult(op1 + op2);
			}
		} else if (op.equals("sub")) {
			if (op2 == 0) {
				throw new SubZeroException("0이 입력되었습니다 결과는 " + op1 + "입니다");
			} else {
				vo.setResult(op1 - op2);
			}
		} else if (op.equals("mul")) {
			if (op1 == 1 || op2 == 1) {
				throw new MulOneException("1이 입력되었습니다 결과는 " + Math.max(op1, op2) + "입니다");
			} else {
				vo.setResult(op1 * op2);
			}
		} else if (op.equals("div")) {
			if (op2 == 1) {
				throw new DivOneException("1이 입력되었습니다 결과는 " + op1 + "입니다");
			} else {
				vo.setResult(op1 / op2);
			}
		}
		new CalEntity(vo);
		System.out.println(vo.getResult());
	}
}
