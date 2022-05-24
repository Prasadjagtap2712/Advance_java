import java.sql.*;
import java.io.*;
class DBDemo
{
 public static void main(String args[]) throws Exception
 {
 String sql,en;
 int e,s,k,ch;
 BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection cn=DriverManager.getConnection("jdbc:odbc:DSN","","");
 Statement st=cn.createStatement();
 do
 {
 System.out.println("1. Create");
 System.out.println("2. Insert");
 System.out.println("3. Update");
 System.out.println("4. Delete");
 System.out.println("5. Display");
 System.out.println("6. Exit");
 System.out.println("Enter Your Choice");
 ch=Integer.parseInt(br.readLine());
 switch(ch)
 {
 case 1:
 sql="create table Emp (Eno number,Ename text, salary number,Desg text)";
 st.execute(sql);
 System.out.println("Table Is Created...!");
 break;
 case 2:
 System.out.println("Eno Ename Sal Desg");
 e=Integer.parseInt(br.readLine());
 en=br.readLine();
 s=Integer.parseInt(br.readLine());
D=br.readLine();
 sql="insert into Emp  values("+ e + ",'"+ en +"'," + s+",”+d+”)";
 k=st.executeUpdate(sql);
 if(k>0)
 System.out.println("Record Is Added...!");
 break;
 case 3:
 System.out.println("Eno And Sal");
 e=Integer.parseInt(br.readLine());
 s=Integer.parseInt(br.readLine());
 sql="update Emp set sal=" + s + " where eno=" + e;
 k=st.executeUpdate(sql);
 if(k>0)
 System.out.println("Record Is Updated...!");
 break;
 case 4:
 System.out.println("Eno");
 e=Integer.parseInt(br.readLine());
 sql="delete from Emp where eno=" + e;
 k=st.executeUpdate(sql);
 if(k>0)
 System.out.println("Record Is Deleted...!");
 break;
 case 5:
 System.out.println("Records from Table are...");
 ResultSet rs=st.executeQuery("select * from Emp");
 while(rs.next())
 {
 System.out.println(rs.getString(1) + " " + rs.getString(2) + " " +
 rs.getString(3));
 }
 break;
 case 6:
 cn.close();
 System.exit(0);
 }
 }
 while(ch!=6);
 }
}