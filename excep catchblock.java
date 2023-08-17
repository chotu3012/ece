import java.io.*;
import java.util.Scanner;
class Super
{
int met1(int a, int b)
{
return a/b;
}
}
class Sub extends Super
{
int met2(String Str)
{
return Str.length();
}
}
class orderofcatchExcMAIN
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int m,n;
String j;
System.out.println("Enter any two numbers");
m=in.nextInt();
n=in.nextInt();
j=null;
Super su1=new Super();
Sub su2=new Sub();
try
{
System.out.println(m+" divided by "+n+" is "+su1.met1(m,n));
su2.met2(j);
}
catch(NullPointerException e)
{
System.out.println(e);
System.out.println("subclass exception occurs");
}
catch(ArithmeticException e)
{
System.out.println(e);
System.out.println("super class exception");
}
catch(Exception e)
{
System.out.println("Something went wrong");
}
System.out.println("remaining code");
}
}