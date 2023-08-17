import java.util.Scanner; 
class linearsearch
{ 
public static void main(String arg[]) 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter array size"); 
int n=sc.nextInt(); 
int a[]=new int[n]; 
int i; 
System.out.println("Enter "+n+" Elements"); 
for(i=0;i<n;i++) 
{ 
a[i]=sc.nextInt(); 
} 
System.out.println("Enter Element to Search"); 
int search=sc.nextInt(); 
for(i=0;i<n-1;i++) 
{ 
if(a[i]==search) 
{ 
System.out.println("Element "+search+" is Found in given array  At Index "+i); 
break; 
} 
} 
} 
} 