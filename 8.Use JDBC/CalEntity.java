
import java.sql.*;

public class CalEntity {    
    public CalEntity(CalVO vo) {
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
		/*
		Statement stmt = con.createStatement();
		String query = "insert into tb_comment(id, content, name) " +
		               "values(1,'abc', 'abc')";
		
		int i= stmt.executeUpdate(query);			
        System.out.println(i+"행이 추가되었습니다.");
		stmt.close();
		*/
		String query = "insert into tb_cal(no , op1, op, op2, result) " +
	               "values(seq_cal.nextval,?, ?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(query); 
		pstmt.setInt(1, vo.getOp1());
		pstmt.setString(2, vo.getOp());
		pstmt.setInt(3, vo.getOp2());
		pstmt.setInt(4, vo.getResult());
		pstmt.executeUpdate();
		pstmt.close();
	
		con.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}    
  }
}