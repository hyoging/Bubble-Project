package bubble_common;

import java.sql.Connection;
import java.sql.DriverManager;

public class BubbleConnect {

	private static Connection con;
	public static Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url,"hyoging","1234");
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		return con;
	}

}
