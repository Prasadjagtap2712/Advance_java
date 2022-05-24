import java.sql.*;
import java.io.*;
public class count
{
public static void main(String [] args)
{
int cnt=0;
Connection con = null;
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("jdbc:odbc:DSN");
Statement sta = con.createStatement();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


String str="select * from stud ";

ResultSet rs=sta.executeQuery(str);
while(rs.next())
{
cnt++;
System.out.println("\tRoll No: "+rs.getInt(1)+"\n\tName: "+rs.getString(2)+"\n\tTotal: "+ rs.getInt(3));
}
System.out.println("total records"+cnt);
rs.close();
sta.close();
con.close();
}
catch (Exception e) {
System.err.println("Exception: "+e.getMessage());

}
}
}
