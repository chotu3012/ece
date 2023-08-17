class Week93rethrow
{
static void two()
{
int[] varun=new int[3];
varun[5]=9;
}
static void one()
{
try
{
two();
}
catch(Exception v)
{
System.out.println("This is Exception in catch of method two()");
System.out.println(v+"\n");
throw v;
}
}
public static void main(String args[])
{
try
{
one();
}
catch(IndexOutOfBoundsException v)
{
System.out.println("This is Exception in catch of method one()");
System.out.println(v);
}
finally
{
System.out.println("\nThis is final statement");
}
}
}