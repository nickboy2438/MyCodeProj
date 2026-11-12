import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Myclass {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_db","root","System@123");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * From categories");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}

	}

}
