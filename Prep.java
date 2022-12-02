import java.sql.*;

public class Prep {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Connection con=DriverManager.getConnection(url,"system","system");
			System.out.println("connection Available");
			Statement smt= con.createStatement();
			ResultSet rs=smt.executeQuery("select * from emp");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
		}
		catch(ClassNotFoundException|SQLException e) {
			System.out.println(e);
		}

	}

}
