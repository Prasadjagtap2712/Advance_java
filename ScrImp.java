import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ScrImp extends JFrame implements ActionListener
{
 JButton b1,b2,b3,b4;
 JTextField t1,t2,t3;
 JLabel l1,l2,l3;
 String sql,en;
 int e,s,i;
 Connection cn;
 ResultSet rs;
 Statement st;
 public ScrImp()
 {
 setLayout(null);
 l1=new JLabel("ENo");
 l2=new JLabel("EName");
 l3=new JLabel("Salary");
 t1=new JTextField();
 t2=new JTextField();
 t3=new JTextField();
 b1=new JButton("First");
 b2=new JButton("Next");
 b3=new JButton("Prev");
 b4=new JButton("Last");

 l1.setBounds(100,100,100,30);
 t1.setBounds(220,100,100,30);
 l2.setBounds(100,140,100,30);
 t2.setBounds(220,140,100,30);
 l3.setBounds(100,180,100,30);
 t3.setBounds(220,180,100,30);
 b1.setBounds(100,220,100,30);
 b2.setBounds(220,220,100,30);
 b3.setBounds(100,260,100,30);
 b4.setBounds(220,260,100,30);
 add(l1);
 add(t1);
 add(l2);
 add(t2);
 add(l3);
 add(t3);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 setSize(500,500);
 setVisible(true);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 try
 {
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 cn=DriverManager.getConnection("jdbc:odbc:TYBBACA","","");
 st=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
 ResultSet.CONCUR_UPDATABLE);
 rs=st.executeQuery("select * from emp");
 rs.next();
 t1.setText(rs.getString(1));
 t2.setText(rs.getString(2));
 t3.setText(rs.getString(3));
 }
 catch(Exception obj)
 {
 }
}
 public void actionPerformed (ActionEvent ae)
 {
 try
 {
 JButton b=(JButton)ae.getSource();
 if(b==b1)
 {
 rs.first();
 t1.setText(rs.getString(1));
 t2.setText(rs.getString(2));
 t3.setText(rs.getString(3));
 }
 if(b==b2)
 {
 rs.next();
 t1.setText(rs.getString(1));
 t2.setText(rs.getString(2));
 t3.setText(rs.getString(3));
 }
 if(b==b3)
 {
 rs.previous();
 t1.setText(rs.getString(1));
 t2.setText(rs.getString(2));
 t3.setText(rs.getString(3));
 }
 if(b==b4)
 {
 rs.last();
 t1.setText(rs.getString(1));
 t2.setText(rs.getString(2));
 t3.setText(rs.getString(3));
 }
 }
 catch(Exception obj)
 {
 }
}
public static void main(String args[])
{
 new ScrImp();
}
}
