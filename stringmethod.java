import java.util.Scanner; 
class stringmethod
{ 
public static void main(String args[]) 
{ 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter a sentence"); 
String sen = sc.nextLine(); 
System.out.println("Enter a Character"); 
char ch = sc.next().charAt(0); 
int count=0; 
for(int i=0;i<sen.length();i++) 
{ 
if(sen.charAt(sen.indexOf(ch))==sen.charAt(i)) 
{ 
count++; 
} 
} 
System.out.println(ch+" is present "+count+ " times in given string"); 
} 
}
