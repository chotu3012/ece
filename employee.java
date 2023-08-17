import java.io.*;
import java.util.*;
class employee{
int id;
String name;
int age;
String gender;
String designation;
int salary;
String address;
String number;
void print(){
System.out.println("\nEmployee ID found and the details are :\n");
System.out.println("Employee ID \t\t: "+id);
System.out.println("Employee Name\t\t: "+name);
System.out.println("Employee Age\t\t: "+age);
System.out.println("Employee Gender\t\t: "+gender);
System.out.println("Employee Designation\t: "+designation);
System.out.println("Employee Salary\t\t: "+salary);
System.out.println("Employee Address\t: "+address);
System.out.println("Employee Mobile number\t: "+number);
}
public static void main(String args[]){
Scanner in=new Scanner(System.in);
Scanner im=new Scanner(System.in);
int find, i, n, flag=0, choice;
System.out.print("Enter number of employees : ");
n=in.nextInt();
employee s[]=new employee[n];
for(i=0;i<n;i++)
s[i]=new employee();
for(i=0;i<n;i++){
System.out.println("\n");
System.out.printf("Enter the ID of employee-%d : ",(i+1));
s[i].id=in.nextInt();
System.out.printf("Enter the Name of employee : ");
s[i].name=im.nextLine();
System.out.printf("Enter the Age \t\t\s\s\s: ");
s[i].age=in.nextInt();
System.out.printf("Enter the Gender \t\s\s\s: ");
s[i].gender=im.nextLine();
System.out.printf("Enter the Designation \t\s\s : ");
s[i].designation=im.nextLine();
System.out.printf("Enter the Salary\t\s\s : ");
s[i].salary=in.nextInt();
System.out.printf("Enter the Address \t\s\s\s: ");
s[i].address=im.nextLine();
System.out.printf("Enter the Mobile Number\s\s\s : ");
s[i].number=im.nextLine();
System.out.println(" ");
}
do{
System.out.print("Enter the ID of employee to be searched : ");
find=in.nextInt();
System.out.println("");
for(i=0; i<n; i++){
if(find==s[i].id){
s[i].print();
flag=1;
break;
}
}
System.out.println("");
if(flag==0)
System.out.println("Employee ID not found!!");
System.out.println(" ");
System.out.print("Enter 1 to continue the search operation or 0 to exit :");
choice=in.nextInt();
System.out.println("");
}
while(choice==1);
}
}