
 import java.sql.*;
import java.io.*;
public class DelQuery
{
public static void main(String [] args)
{
Connection con = null;
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("jdbc:odbc:DSN");
Statement sta = con.createStatement();
String str="Delete * from stud where name like ‘S%’";
int k=sta.executeUpdate(str);
if(k>0)
System.out.println("Deleted "+k);

ResultSet rs=sta.executeQuery("select * from stud");
while(rs.next())
{
System.out.println("rollno  "+rs.getInt(1));
System.out.println("name    "+rs.getString(2));
System.out.println("TOTAL   "+rs.getInt(3));
}
rs.close();
sta.close();
con.close();
}
catch (Exception e) {
System.err.println("Exception: "+e.getMessage());

}
}
}
