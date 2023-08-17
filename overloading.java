class parent 
 { 
 void m1() 
 { 
 System.out.println("you must study MBA"); 
 } 
 void m2() 
 { 
 System.out.println("MBA is better to you"); 
 } 
 } 
 class override extends parent 
 { 
 void m1() 
 { 
 System.out.println("i will study B.tech"); 
 } 
 void m2() 
 { 
 System.out.println("B.tech also better for me"); 
 } 
 public static void main(String args[]) 
 { 
 override c1= new override(); 
 c1.m1(); 
 c1.m2(); 
 } 
}





import java.util.Scanner; 
class over 
 { 
 void cal(int a, char c) 
 { 
 System.out.println("iam in cal :"+(a+c)); 
 System.out.println("iam in cal :"+a+c); 
 } 
 void cal(char c) 
 { 
 System.out.println("iam in cal of a:"+c); 
 } 
 void cal(int a) 
 { 
 System.out.println("iam in cal of :"+a*a); 
 } 
 } 
 class overload 
 { 
 public static void main(String args[]) 
 { 
 over c1 = new over (); 
 c1.cal(20,'k'); 
 c1.cal('k'); 
 c1.cal(20); 
 
 } 
 }