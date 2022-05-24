import java.io.*;
import java.util.*;

 class MyThread extends Thread
{
    String str;
    int i;
    char c;
  
    MyThread(String s)
    {
               str=s;             
           
    }
     public void run()
     {
      for(i=0;i<str.length();i++)
       {
          c=str.charAt(i);
        if(c=='a' || c=='A' ||    c=='e' || c=='E' ||  c=='i' || c=='I' || c=='o' || c=='O' ||       c=='u' || c=='U' )
            {
                System.out.print(" " + "\t"+c);
             }
        }
    }
}   

class Vowel
{
   public static void main(String args[])
   {
      try
      {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter The String");
            String str=br.readLine();
            MyThread t=new MyThread(str);
            t.start();
      }
      catch(Exception obj)
      {
            System.out.println(obj);
      }
                    
   }
}
