package demo;

import java.sql.*;
public class dbconnect {
    public static void main(String[] args){
	try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(	"jdbc:mysql://localhost:3306/department", "root","2005#&@mohi");			
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from dep_details"); 
           
            while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
            con.close();
                      
        }
        catch(Exception e){ 
            System.out.println(e);
        
        }
    }
}
