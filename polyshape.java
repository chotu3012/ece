class polyshape 
{ 
void area(float x) 
{ 
System.out.println("The area of the square: "+x*x+"sq.units"); 
} 
void area(float x,float y) 
{ 
System.out.println("The area of the rectangular: "+x*y+"sq.units"); 
} 
void Area(double x) 
{ 
double z=3.14*x*x; 
System.out.println("The area of the circle "+z+"sq.units"); 
} 
void Area(int x,int y) 
{ 
float r=(x*y)/2; 
System.out.println("The area of the trianle "+r+"sq.units"); 
} 
} 
class cal_shape 
{ 
public static void main(String a[]) 
{ 
polyshape s=new polyshape(); 
s.area(10); 
s.area(20,30); 
s.Area(5); 
s.Area(2,5); 
} 
}