import java.awt.*;
import java.awt.event.*;
class NumText extends Frame implements Runnable, ActionListener
{
 TextField t1;
 Thread t;
 Button b;
 int i;
 public NumText()
 {
 setLayout(null);
 t1=new TextField();
 t=new Thread(this,"Ass7B");
 b=new Button("Start");
 t1.setBounds(100,100,100,30);
 b.setBounds(100,140,100,30);
 add(t1);
 add(b);
 b.addActionListener(this);
 setSize(400,400);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent ae)
 {
 t.start();
 }
 public void run()
 {
 try
 {
 for(i=1;i<=100;i++)
 {
 t.sleep(200);
 t1.setText(Integer.toString(i));
 }
 }
 catch(Exception obj)
 {
 }
 }
 public static void main(String args[])
 {
 new NumText();
 }
}
