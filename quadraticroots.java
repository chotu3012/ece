import java.util.Scanner; 
import java.util.*; 
class quadraticroots { 
public static void main(String arg[]) 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter a value:");int a=sc.nextInt(); 
System.out.println("Enter b value:"); 
int b=sc.nextInt(); 
System.out.println("Enter c value:"); 
int c=sc.nextInt(); 
System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x +"+c); 
int d=b*b-4*a*c; 
if(d>0) 
{ 
System.out.println(" Roots are real and unequal"); 
double r1,r2; 
r1=(-b+(Math.sqrt(d))/(2*a)); 
r2=(-b-(Math.sqrt(d))/(2*a)); 
System.out.println("The Roots are:"+r1 ); 
System.out.println("The Roots are:"+r2 ); 
} 
else if(d==0) 
{ 
System.out.println(" Roots are real and equal"); 
double r1,r2; 
r1=(-b+(Math.sqrt(d))/(2*a)); 
r2=(-b-(Math.sqrt(d))/(2*a)); 
System.out.println(" Roots are:"+r1 ); 
System.out.println("The Roots are:"+r2 ); 
} 
else 
{ 
double r1,r2; 
System.out.println("The Roots are imaginary:"); 
r1=(-b+(Math.sqrt(d))/(2*a)); 
r2=(-b-(Math.sqrt(d))/(2*a)); 
System.out.println(" Roots are:"+r1 ); 
System.out.println("The Roots are:"+r2 ); 
} 
} 
}