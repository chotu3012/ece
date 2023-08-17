import java.util.Scanner; 
public class Products 
{ 
public static void main(String[] args) 
{ 
Scanner input = new Scanner (System.in); 
 double product1; 
 double product2; 
 double product3; 
 double product4; 
 double product5; 
 int quantity; 
 double totalSales = 0; 
 System.out.println("Choose product 1 to 5 "); 
 System.out.println("Product 1 : Rs. 99.90\nProduct 2 : Rs. 20.20\nProduct 3 : Rs. 
6.87\nProduct 4 : Rs. 45.50\nProduct 5 : Rs. 40.49"); 
 int productNo=input.nextInt(); 
 System.out.println("Enter quantity sold "); 
 quantity = input.nextInt(); 
 switch (productNo) 
 { 
 case 1: product1 = 99.90; 
 totalSales+=(99.90*quantity); 
 break; 
 case 2: product2 = 20.20; 
 totalSales+=(20.20*quantity); 
 break; 
 case 3: product3 = 6.87; 
 totalSales+=(6.87*quantity); 
 break; 
 case 4: product4 = 45.50; 
 totalSales+=(45.50*quantity); 
 break; 
 case 5: product5 = 40.49; 
 totalSales+=(40.49*quantity); 
 break; 
 } 
 
 System.out.println("The total retail value of all products 
sold:\n"+totalSales); 
} 
} 
