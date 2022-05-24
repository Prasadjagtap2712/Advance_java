 import java.net.*;
import java.io.*;
public class IP
{
public static void main(String[] ar) 
{
try 
{
InetAddress ip=InetAddress.getLocalHost();

String p1=ip.getHostAddress();
System.out.println(p1);

String p2=ip.getHostName();
System.out.println(p2);
}
catch(Exception e)
{
}
}
}
