import java.io.*; 
import java.util.*; 
class Theatre extends Thread{ 
public void run(){ 
Scanner sc= new Scanner(System.in); 
Random r = new Random(); 
System.out.print("Enter the no. of persons : "); 
int n= sc.nextInt();// no. of persons 
int a[][]=new int[n][2]; 
System.out.println("Enter 1 to issue ticket, 0 if not");
for(int i=0;i<n;i++){
System.out.printf("Enter status for person %d : ",i+1); 
a[i][0]=sc.nextInt();// person bought the ticket set as one 
if(a[i][0]==1)
System.out.println("Ticket "+ (i+1) +" issued");
else
System.out.println("Ticket "+ (i+1) +" not issued");
}
try{
Thread.sleep(5000); 
}
catch(Exception e){} 
System.out.print("Enter 1 if ticket showed, 0 if not showed"); 
System.out.println("\n"); 
for(int i=0;i<n;i++){
System.out.printf("Enter status for person %d : ",i+1); 
a[i][1]=sc.nextInt(); 
if(a[i][1]==1)
System.out.println("Ticket "+ (i+1) +" showed");
else
System.out.println("Ticket "+ (i+1) +" not showed");
}
try{
Thread.sleep(5000); 
}
catch(Exception e){} 
System.out.println("\n"); 
for(int i=0;i<n;i++){ 
int j=i;
if(a[j][0]==1 && a[j][1]==1) 
System.out.println("Ticket No. "+(j+1)+" holder is entered");
}
}
}
class Tickets{ 
public static void main(String arg[]){ 
Theatre t =new Theatre();
t.start();
}
}
