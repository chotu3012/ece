import java.util.Scanner; 
class palindrome
{ 
public static void main(String arg[]) 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter number"); 
int a=sc.nextInt(); 
int t=a; 
int sum=0; 
while(a>0) 
{ 
sum=sum*10; 
int rem=a%10; 
sum=sum+rem; 
a=a/10; 
} 
if(t==sum) 
{ 
System.out.println("Given number is palindrom "+sum); 
} 
else 
{ 
System.out.println("Given number is not palindrom "+t); 
} 
} 
}