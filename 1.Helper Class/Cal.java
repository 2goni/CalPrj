class Cal {
	int result;

	void doCal(String[] args) {
		int op1 = Integer.parseInt(args[0]);
		String op = args[1];
		int op2 = Integer.parseInt(args[2]);

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
