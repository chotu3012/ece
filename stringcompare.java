import java.util.Scanner; 
class stringcompare
{ 
public static void main(String args[]) 
{ 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter a String"); 
String s=sc.nextLine(); 
System.out.println("Enter another String"); 
String s1=sc.nextLine(); 
if(s.compareTo(s1)>0) 
{ 
System.out.println(s+" is greaterthan "+s1); 
} 
else if(s.compareTo(s1)<0) 
{ 
System.out.println(s+" is lessthan "+s1); 
} 
else 
{ 
System.out.println("Given two Strings are equal"); 
} 
} 
}