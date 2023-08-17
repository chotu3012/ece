import java.util.*; 
public class between10and100
{ 
public static void main(String args[]) 
{ 
Scanner s=new Scanner(System.in); 
int arr[]=new int[5]; 
for(int i=0;i<5;i++) 
{ 
int count=0; 
System.out.println("enter the element"); 
int e=s.nextInt(); 
for(int j=0;j<arr.length;j++) 
{ 
if(e==arr[j]) 
{ 
count=1; 
System.out.println("number already exists,enter another number"); 
i=i-1; 
break; 
} 
else if(e<10||e>100) 
{ 
count=1; 
System.out.println("number is not in range (10&100)enter a valid number"); 
i=i-1; 
break; 
} 
} 
if(count!=1) 
{ 
arr[i]=e; 
for (int k=0;k<=i;k++) 
{ 
System.out.print(arr[k]+" "); 
} 
} 
 } 
 } 
} 
