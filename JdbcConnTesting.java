import java.sql.*;
public class JdbcConnTesting{
	public static void main(String [] arg)throws Exception{
		 String url="JDBC:ORACLE:thin:@LOCALHOST:1521:XE";
		String username="SYSTEM";
		String pwd="mca1427";
		String className="oracle.jdbc.driver.OracleDriver";
		Connection con=null;
		
		Class.forName(className);
//		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca1427");
		System.out.println("Driver Loaded.......");
		con=DriverManager.getConnection(url,username,pwd);
		System.out.println("Connection Established..........");
	}
}