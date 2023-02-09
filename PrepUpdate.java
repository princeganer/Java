import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PrepUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    String url="jdbc:oracle:thin:@localhost:1521:XE";
		    Connection con=DriverManager.getConnection(url,"system","system");
		    System.out.println("connection ho gya yaay");
		    
		    PreparedStatement psmt=con.prepareStatement("insert into student values(?,?,?)");
		    psmt.setInt(1, 10);
		    psmt.setString(2,"Vandana");
		    psmt.setDouble(3,94.2);
		    int no=psmt.executeUpdate();
		    System.out.println(no+" record inserted");
		    
		

		}
	  catch(Exception e) {
			System.out.println(e);
		}
	}
}


