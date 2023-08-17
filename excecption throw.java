import java.io.IOException;
import java.util.Scanner;
class W91
{
static String s;
W91(String s)
{
this.s=s;
}
public static void main(String args[]) throws IOException
{
String a;
Scanner in=new Scanner(System.in);
System.out.println("Enter a sting you want");
a=in.nextLine();
W91 m=new W91(a);
try
{
throw new IOException("exception occured");
}
catch(Exception e)
{
System.out.println(e);
System.out.println("exception is handeled in catch block");
System.out.println("the string u entered is "+s);
}
finally
{
System.out.println("This is finally block");
}
}
}
