import java.util.Scanner; 
abstract class Employee 
{ 
abstract void getAmount(int m,int n); 
} 
class HE extends Employee 
{
public void getAmount(int m,int wage) 
{ 
System.out.println("Amount paid to hourly employee:"+(m*wage)); 
} 
} 
class WE extends Employee 
{
public void getAmount(int p,int Wage) 
{ 
System.out.println("Amount paid to Weekly employee:"+(p*Wage)); 
} 
} 
class Main 
{ 
public static void main(String args[]) 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter no.of hours HourlyEmployee worked: "); 
int a=sc.nextInt(); 
System.out.println("Enter Wage value of Hourly Employee:"); 
int b=sc.nextInt(); 
System.out.println("Enter no.of weeks WeeklyEmployee worked:"); 
int c=sc.nextInt(); 
System.out.println("Enter Wage value of Weekly Employee:"); 
int d=sc.nextInt(); 
Employee sc1= new HE(); 
Employee sc2= new WE(); 
sc1.getAmount(a,b); 
sc2.getAmount(c,d); 
} 
} 
OutPut