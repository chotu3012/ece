import java.util.Scanner; 
interface Fare 
{ 
void getAmount(int K,int C); 
} 
class Bus implements Fare 
{ 
public void getAmount(int K,int C) 
{ 
System.out.println("Amount paid for travelling by Bus:"+(K*C)); 
} 
} 
class Train implements Fare 
{ 
public void getAmount(int K,int C) 
{ 
System.out.println("Amount paid for travelling by Train:"+(K*C)); 
} 
} 
class Main 
{ 
public static void main(String args[]) 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter No.of Kilometers travelled by bus:"); 
int k=sc.nextInt(); 
System.out.println("Enter No.of Kilometers travelled by Train:"); 
int k1=sc.nextInt(); 
System.out.println("Enter fare for Kilometer travelled by bus:"); 
int f=sc.nextInt(); 
System.out.println("Enter fare for Kilometer travelled by Train:"); 
int f1=sc.nextInt(); 
Fare b=new Bus(); 
Fare t=new Train(); 
b.getAmount(k,f); 
t.getAmount(k1,f1); 
} 
} 
