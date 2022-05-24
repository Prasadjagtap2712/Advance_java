import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Slip24B extends JFrame implements ActionListener
{
  JLabel l1,l2,l3,l4;
  JTextField t1,t2,t3,t4;
  JButton b; 
  Connection cn;
  PreparedStatement pst;
  ResultSet rs;
  public Slip24B()
  {
    setLayout(null);
    l1=new JLabel("College Id");
    l2=new JLabel("Name");
    l3=new JLabel("Address");
     l4=new JLabel("Year");
    t1=new JTextField();
    t2=new JTextField();
    t3=new JTextField();
    t4=new JTextField();
    b=new JButton("Save");
    l1.setBounds(50,50,100,30);
    t1.setBounds(160,50,100,30);
    l2.setBounds(50,90,100,30);
    t2.setBounds(160,90,100,30);
    l3.setBounds(50,130,100,30);
    t3.setBounds(160,130,100,30);
	l4.setBounds(50,170,100,30);
    t4.setBounds(160,170,100,30);
    b.setBounds(50,200,100,30);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(l4);
    add(t4);
    add(b);
    b.addActionListener(this);
    setSize(500,500);
    setVisible(true);
    
  }
  public void actionPerformed(ActionEvent oe)
  {
    String str=oe.getActionCommand();
    if(str.equals("Save"))
    {
      try
      {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            cn=DriverManager.getConnection("jdbc:odbc:EVPillaiDSN");
            
		
            int cid=Integer.parseInt(t1.getText());
            String cname=t2.getText();
            String address=t3.getText();
		String year=t4.getText();
          
            pst =cn.prepareStatement("insert into college values(?,?,?,?)");
             pst.setInt(1,cid);
	pst.setString(2,cname);
	pst.setString(3,address);
	pst.setString(4,year);
            int k=pst.executeUpdate();
            if(k>0) 
            {
                  
                  JOptionPane.showMessageDialog(null,"Record Is Added");
            }
      }
      catch(Exception er)
      {
            System.out.println("Error");
        }
    }
  }
 public static void main(String args[])
 {
   new Slip24B();
 }
} 
