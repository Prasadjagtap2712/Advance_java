import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/*<applet code="AssFlag" width="400" height="400"> </applet> */
public class AssFlag extends Applet implements Runnable
{
 Thread t1;
 int x,y,x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6;
 int x7,y7,x8,y8;
 public void init()
 {

 x7=x8=100;
 y7=y8=150;
 x5=y5=x6=y6=125;
 x=x2=y2=100;

 x3=x4=150;
 y4=y3=100;
 y=100;
 x1=100;
 y1=100;
 t1=new Thread(this,"Ass");
 t1.start();

 }

 public void run()
 {
 try
 {
 while(true)
 {
 t1.sleep(100);
 if(y1<=300)
 {
 y1=y1+5;
 repaint();
 }
 if(x2<=150)
 {
 x2=x2+5;
 repaint();
 }
 if(x4>=125 && y4<=125)
 {
 x4=x4-5;
 y4=y4+5;
 repaint();
 }
 if(x6<=150 && y6<=150)
 {
 x6=x6+5;
 y6=y6+5;
 repaint();
 }
 if(x8<=150)
 {
 x8=x8+5;
 repaint();
 }
 }
 }
 catch(Exception obj)
 {
 }
 }
 public void paint(Graphics g)
 {
 g.drawLine(x,y,x1,y1);
 g.drawLine(x,y,x2,y2);
 g.drawLine(x3,y3,x4,y4);
 g.drawLine(x5,y5,x6,y6);
 g.drawLine(x7,y7,x8,y8);
 }
}
