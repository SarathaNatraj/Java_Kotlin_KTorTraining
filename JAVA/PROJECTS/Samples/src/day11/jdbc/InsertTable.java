package day11.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("com.mysql.jdbc.Driver");
	         c = DriverManager
	                 .getConnection("jdbc:mysql://localhost:3306/sample",
	                         "root", "1234");
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "INSERT INTO COMPANY1 (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (5, 'Paul Alen', 32, 'California', 20000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY1 (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (6, 'Allen Teddy', 25, 'Texas', 15000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY1 (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (7, 'Teddy 1mark', 23, 'Norway', 20000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY1 (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (8, 'Mark Anto', 25, 'Rich-Mond ', 65000.00 );";
	         stmt.executeUpdate(sql);

	         stmt.close();
	         c.commit();
	         c.close();
	      } catch (Exception e) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Records created successfully");


	}

}
