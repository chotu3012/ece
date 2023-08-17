import java.util.Scanner;
class product{
public static void main(String []args){
Scanner n=new Scanner(System.in);
int product_1;
int product_2;
int product_3;
int product_4;
int product_5;
double total_price=0;
System.out.println("Choose product 1 to 5");
System.out.println("Available products are ");
System.out.println("Product 1: Rs.99\nProduct 2: Rs.89\n Product 3: Rs.49\n Product 4: Rs.199\n Product 5: Rs.9");
int product_no=n.nextInt();
System.out.println("enter the quantity sold");
int quantity=n.nextInt();
switch(product_no){
case 1:
product_1=99;
total_price=(99*quantity);
System.out.println("the retail price is"+total_price);
break;
case 2:
product_2=89;
total_price=(89*quantity);
System.out.println("the retail price is"+total_price);
break;
case 3:
product_3=49;
total_price=(49*quantity);
System.out.println("the retail price is"+total_price);
break;
case 4:
product_4=199;
total_price=(199*quantity);
System.out.println("the retail price is"+total_price);
break;
case 5:
product_5=9;
total_price=(9*quantity);
System.out.println("the retail price is"+total_price);
break;
}
}
}