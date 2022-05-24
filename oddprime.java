class odd extends Thread
{
  int n,i;
      
  odd(int x)
   {	
	n=x;
      System.out.println(this);
      start();
    }

 public void run()
  {
      try
      {
            
            
            for(i=1;i<=n;i++)
            {
                    if(i%2!=0)
	System.out.println("\t"+i);
            }
                  
            
      }
      catch(Exception e)
      {

         System.out.println(e);
      }
   }
}

class prime extends Thread
{
  int n,i,j;
      
  prime(int x)
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
            for(i=2;i<n;i++)
{
            for(j=2;j<=i;j++)
            {
                    if (i %j==0)
                     {
                  break;
                     }       
            }
            if(i==j)
            {
                  System.out.println(i+"Prime");
            }
            }
      
      }
      catch(Exception e1)
      {

         System.out.println(e1);
      }
   }
}

class oddprime
{
      public static void main(String args[])
      {
        try
        {
            odd p=new odd(15);
            prime pr=new prime(15);
         }
         catch(Exception e)
          {
            System.out.println(e);
                   }
      }
}


