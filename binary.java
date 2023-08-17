import java.util.Scanner; 
class binary 
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
int first=0,last=n-1,middle; 
middle=(first+last)/2; 
while(first<=last) 
{ 
if(a[middle]<search) 
first=middle+1; 
else if(a[middle]==search) 
{ 
System.out.println("Element "+search+" is found at "+
(middle+1)+" "); 
break; 
} 
else 
last=middle-1; 
middle=(first+last)/2; 
} 
if(first>last) 
System.out.println(search+" is not present"); 
} 
}
