 import java.io.*;
class Msg implements Runnable
{
  int n;
   public Msg(int x)
   {
	     n=x;
            
   }
   public void run()
   {
      try
      {
          for(int i=0;i<n;i++)
          {
        Thread.sleep(500);

                   System.out.println("Hello java");
          }
       }
       catch(Exception op)
       {
                   System.out.println(op);
       }
   }
}
class Hello
{
   public static void main(String args[])
   {         int n;    
      DataInputStream in=new DataInputStream(System.in);
          try
         { 
            System.out.println("Enter n");
            n=Integer.parseInt(in.readLine());
          
                 Msg m=new Msg(n);
	         Thread t=new Thread(m);
		t.start();
           }
          catch(Exception e)
           {}
    }
} 
