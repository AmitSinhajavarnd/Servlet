import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.exam.Dbutility.DBUtility;

public class TestClass extends SQLException {
	
public static void main(String[]args){
	
	DBUtility db = new DBUtility();
	System.out.println("----------------------------------------------------------------");
	System.out.println("----------------------------------------------------------------");

	System.out.println(db.testdb());
	
	
}	
}
