package Shapes; 
public class Triangle 
{ 
public void area(double l,double b) 
{ 
System.out.println(0.5*l*b); 
} 
public void perimeter(double s,double s1,double s2) 
{ 
System.out.println(s+s1+s2); 
} 
}
package Shapes; 
public class Square 
{ 
public void area(double a) 
{ 
System.out.println(a*a); 
} 
public void perimeter(double s) 
{ 
System.out.println(4*s); 
} 
}
package Shapes; 
public class Circle 
{ 
public void area(double r) 
{ 
System.out.println(3.14*r*r); 
} 
public void circumference(double d) 
{ 
System.out.println(3.14*d); 
} 
}
import Shapes.Triangle; 
import Shapes.Square; 
import Shapes.Circle; 
public class Mainshapes 
{ 
public static void main(String args[]) 
{ 
Triangle t=new Triangle(); 
Square s=new Square(); 
Circle c=new Circle(); 
System.out.println("Area of Triangle is:"); 
t.area(4,5); 
System.out.println("Perimeter of Triangle is:"); 
t.perimeter(1,2,3); 
System.out.println("Area of Square is:"); 
s.area(4); 
System.out.println("Perimeter of Square is:"); 
s.perimeter(8); 
System.out.println("Area of Circle is:"); 
c.area(5); 
System.out.println("Circumference of Circle is:"); 
c.circumference(8); 
} 
