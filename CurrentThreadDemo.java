class CurrentThreadDemo
{
public static void main(String args[])
{
Thread t = Thread.currentThread();
System.out.println("Current thread: " + t);
// change the name of the thread
t.setName("My Thread");
System.out.println("After name change: " + t.getName());
System.out.println("Current thread: " + t);
try
{

for(int n = 6; n > 0; n--)
{
System.out.println(n);
}
}
catch (Exception e)
{
}
}
}
