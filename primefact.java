import java.util.Scanner; 
class Primefact 
{ 
public static void main(String arg[]) 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter a number"); 
int a=sc.nextInt(); 
int count=0; 
System.out.println("Prime factors of "+a+" are:"); 
if(a>=2&&a%2==0) 
{ 
System.out.println("2"); 
} 
for(int i=1;i<=a;i++) 
{ 
if(a%i==0) 
{ 
for(int j=2;j<i;j++) 
{ 
if(i%j==0) 
{ 
count=0; 
break; 
} 
else 
{ 
count=1; 
} 
} 
if(count==1) 
{
System.out.println(i); 
} 
} 
} 
} 
} 
