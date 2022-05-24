import java.io.*;
class fact extends Thread
{
  int n,i,f;
      
  fact(int x)
   {	
	n=x;
      System.out.println(this);
      start();
    }

 public void run()
  {
      try
      {
            sleep(3000);
            f=1;
            for(i=1;i<=n;i++)
            {
                    f=f*i;
            }
                  System.out.println(f);
            
      }
      catch(Exception e)
      {

         System.out.println(e);
      }
   }
}
class fact18
{
      public static void main(String args[])
      {
        try
        {
            fact p=new fact(6);
         }
         catch(Exception e)
          {
            System.out.println(e);
                   }
      }
}
