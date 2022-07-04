package com;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

	        Class.forName("com.mysql.jdbc.Driver");

	        Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hexa_Emp", "root","Shrikant2510@");

	        Statement stmt = con.createStatement();

	        
//	        stmt.execute("insert into emp values (102, 'vk', 27,50000, 'Dev.','1995-07-18','pune',976,2308,'abcd')");
//	        stmt.execute("insert into emp values (103, 'jk', 33,20000, 'Support.','2000-01-12','mumbai',9767,23084,'efg')");
//	        stmt.execute("insert into emp values (104, 'mk', 21,20000, 'Support.','2004-03-02','pune',97679,2308420,'hijk')");
//	        stmt.execute("insert into emp values (105, 'kk', 20,10000, 'Clerk.','1999-04-08','usa',9767950235,230842089087,'lmno')");
//	        stmt.execute("insert into emp values (106, 'kj', 29,90000, 'Manager.','1998-05-25','india',9767953,23084207,'pqrs')");
//	        stmt.execute("insert into emp values (107, 'rk', 25,80000, 'SrDev.','2001-12-26','pune',9767951,2308420872,'tvuw')");
//	        stmt.execute("insert into emp values (108, 'srk', 23,50000, 'Dev.','2002-09-18','satara',9767954,23084208727,'xyz')");
	        stmt.execute("insert into emp values (109, 'ark', 28,50000, 'Dev.','2001-03-02','mumbai',97679544,230842087274,'yui12')");
//	        stmt.execute("insert into emp values (110, 'sak', 22,40000, 'HR.','1999-01-27','satara',976795071,2308420872743,'nacho4564')");
	        stmt.close();  

	        System.out.println("Data saved successfully...!");

	        }

	        catch (Exception e) {

	        System.out.println(e);

	        }
	}

}
