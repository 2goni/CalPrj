package entity;
import java.sql.*;
import vo.CalVO;

public class CalEntity {
	public void insert(CalVO vo) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");	
		}catch(ClassNotFoundException e ) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pass = "tiger";
		try {		
			Connection con = DriverManager.getConnection(url,user,pass);		
			
			String query = "insert into tb_cal(no, op1, op, op2, result) " + "values(seq_log.nextval, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = con.prepareStatement(query); 
			pstmt.setInt(1, Integer.parseInt(vo.getOp1()));
			pstmt.setString(2, vo.getOp());
			pstmt.setString(3, vo.getOp2());
			pstmt.setString(4, vo.getResult());
			pstmt.executeUpdate();	
			
			pstmt.close();		
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}    
	  }		
}

