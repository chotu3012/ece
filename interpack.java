package Oops; 
public class Class 
{ 
public void m() 
{ 
System.out.println("Good Morning,Sir"); 
} 
}
package Oops; 
public interface inter 
{ 
public void m1(); 
}
import Oops.Class; 
import Oops.inter; 
class A implements inter 
{ 
public void m1() 
{ 
System.out.println("Iam a Method From interface"); 
} 
public static void main(String args[]) 
{ 
Class c=new Class(); 
c.m(); 
A a=new A(); 
a.m1(); 
} 
}
