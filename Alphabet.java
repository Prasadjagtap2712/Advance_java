 import java.io.*;
import java.util.*;

 class MyThread extends Thread
{
    char c;
  
    
     public void run()
     {
         String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      for(int i=0;i<str.length();i++)
       {
          c=str.charAt(i);
          System.out.print(" " + "\t"+c);
          try
            {
              sleep(3000);
             }
          catch(InterruptedException e)
           { 
            System.out.println(e);
            }   
        }
    }
}   

class Alphabet
{
   public static void main(String args[])
   {
        MyThread t=new MyThread();
            t.start();
 }
}
