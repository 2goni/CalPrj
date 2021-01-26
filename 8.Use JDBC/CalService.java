class CalService implements ICalService {

	@Override
	public void doCal(CalVO vo) throws Exception {
		int op1 = vo.getOp1();
		String op = vo.getOp();
		int op2 = vo.getOp2();
		if (op.equals("add")) {
			if (op1 == 0 || op2 == 0) {
				throw new AddZeroException("0�� �ԷµǾ����ϴ� �����" + Math.max(op1, op2) + "�Դϴ�");
			} else {
				vo.setResult(op1 + op2);
			}
		} else if (op.equals("sub")) {
			if (op2 == 0) {
				throw new SubZeroException("0�� �ԷµǾ����ϴ� ����� " + op1 + "�Դϴ�");
			} else {
				vo.setResult(op1 - op2);
			}
		} else if (op.equals("mul")) {
			if (op1 == 1 || op2 == 1) {
				throw new MulOneException("1�� �ԷµǾ����ϴ� ����� " + Math.max(op1, op2) + "�Դϴ�");
			} else {
				vo.setResult(op1 * op2);
			}
		} else if (op.equals("div")) {
			if (op2 == 1) {
				throw new DivOneException("1�� �ԷµǾ����ϴ� ����� " + op1 + "�Դϴ�");
			} else {
				vo.setResult(op1 / op2);
			}
		}
		new CalEntity(vo);
		System.out.println(vo.getResult());
	}
}
