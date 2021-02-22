package service;

import entity.CalEntity;
import vo.CalVO;

public class CalService implements ICalService {
	private CalEntity ce;
	public CalService() {
		ce = new CalEntity();
	}
	public void doCal(CalVO vo) {
		int op1 = Integer.parseInt(vo.getOp1());
		String op = vo.getOp();
		int op2 = Integer.parseInt(vo.getOp2());
		
		if(op.equals("add")) {
				vo.setResult(op1 + op2 + "");
		} else if(op.equals("sub")) {
			vo.setResult(op1 - op2 + "");
	    } else if(op.equals("mul")) {
			vo.setResult(op1 * op2 + "");
	    } else if(op.equals("div")) {
			vo.setResult(op1 / op2 + "");
	    }
		ce.insert(vo);
		
	}
}
