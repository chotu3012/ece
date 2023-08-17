import java.util.*; 
class ebook
{ 
public static void main(String args[]) 
{ 
Book b1=new Book("OOP","Mounika",10); 
customer c1=new customer("CSE","rgukt_basar",10); 
c1.buy(b1,2); 
Book b2=new Book("SL","Radhika",20); 
customer c2=new customer("CSE","rgukt_basar",20); 
c2.buy(b2,10); 
} 
} 
class Book
{ 
String name,author; 
int count; 
public Book(String name,String author,int count) 
{ 
this.name=name; 
this.author=author; 
this.count=count; 
} 
public void sell(int n) 
{ 
if(n<=count) 
{ 
count=count-n; 
System.out.println("sold"+n+"copies of books"+name);System.out.println("remaining copies="+count); 
} 
else 
{ 
System.out.println("stock not available"); 
} 
} 
} 
class customer 
{ 
String name,address; 
int cid; 
public customer(String name,String address,int cid) 
{ 
this.name=name; 
this.address=address; 
this.cid=cid; 
} 
public void buy(Book b,int n) 
{ 
System.out.println(name+"is buying a book"); 
b.sell(n); 
} 
}