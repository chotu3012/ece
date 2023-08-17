import java.util.Scanner; 
interface Vehicle 
{ 
void getColor(String c); 
void getNumber(int n); 
void getConsumption(int l,int fuelcost); 
} 
class TwoWheeler implements Vehicle 
{ 
public void getColor(String c) 
{ 
System.out.println("Color of the TwoWheeler is:"+c); 
} 
public void getNumber(int n) 
{ 
System.out.println("Number of the TwoWheeler is:"+n); 
} 
public void getConsumption(int l,int fuelcost) 
{ 
System.out.println("Consumption of TwoWheeler is:"+(l*fuelcost)); 
} 
} 
class FourWheeler implements Vehicle 
{ 
public void getColor(String c) 
{ 
System.out.println("Color of the FourWheeler is:"+c); 
} 
public void getNumber(int n) 
{ 
System.out.println("Number of the FourWheeler is:"+n); 
} 
public void getConsumption(int l,int fuelcost) 
{ 
System.out.println("Consumption of FourWheeler is:"+(l*fuelcost)); 
} 
} 
class Main 
{ 
public static void main(String args[]) 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter The color of TwoWheeler:"); 
String C=sc.nextLine(); 
System.out.println("Enter Number of TwoWheeler:"); 
int N=sc.nextInt(); 
System.out.println("Enter Number of Litres of Fuel Consumed by 
TwoWheeler:"); 
int L=sc.nextInt(); 
System.out.println("Enter the cost of Fuel per litre Consumed by 
TwoWheeler:"); 
int FC=sc.nextInt(); 
System.out.println("Enter The color of FourWheeler:"); 
String C1=sc.next(); 
System.out.println("Enter Number of FwoWheeler:"); 
int N1=sc.nextInt(); 
System.out.println("Enter Number of Litres of Fuel Consumed by 
FwoWheeler:"); 
int L1=sc.nextInt(); 
System.out.println("Enter the cost of Fuel per litre Consumed by 
FwoWheeler:"); 
int FC1=sc.nextInt(); 
Vehicle TW=new TwoWheeler(); 
Vehicle FW=new FourWheeler(); 
TW.getColor(C); 
TW.getNumber(N); 
TW.getConsumption(L,FC); 
FW.getColor(C1); 
FW.getNumber(N1); 
FW.getConsumption(L1,FC1); 
} 
} 
