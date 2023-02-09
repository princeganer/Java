package demoapp;
import java.sql.*;
import java.util.Scanner;

public class DemoMenu {

	public static void main(String[] args) {

		Connection con=null;
		Statement smt=null;
		PreparedStatement psmt=null;

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			con=DriverManager.getConnection(url,"system","system");




			int ch=0;
			do
			{
				System.out.println("1. Insert Record"
						+ "         2. Display All Records"
						+ "         3. Update name"
						+ "         4. Delete"
						+ "         0. Exit"
						+ "         Enter your Choice ");
				Scanner sc=new Scanner(System.in);
				ch=sc.nextInt();

				switch(ch)
				{
				case 1:  //Insert record
					int rno;String name;double avg;

					System.out.println(" Enter Rno Name And Avg ");
					rno= sc.nextInt();
					name= sc.next();
					avg= sc.nextDouble();

					psmt= con.prepareStatement("insert into student values (?,?,?)");
					psmt.setInt(1, rno);
					psmt.setString(2, name);
					psmt.setDouble(3, avg);

					int no= psmt.executeUpdate();
					System.out.println(no +" REcords Inserted ");
					break;

				case 2:  //Display records
					smt = con.createStatement();
					ResultSet rs= smt.executeQuery("SELECT * FROM student");

					while (rs.next()){
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
					}
					break;
					
				case 3: //Update Name
					smt = con.createStatement();
					
					System.out.println(" Enter Name ");
					name= sc.next();
					rno= sc.nextInt();
					
					psmt= con.prepareStatement("UPDATE student SET name= (?) WHERE rno= (?)");
					psmt.setString(1, name);
					psmt.setInt(2, rno);
					break;
				
				case 4:  //Delete column
					
					
				

				}

			}while(ch!=0);

		}	
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}


	}
}
