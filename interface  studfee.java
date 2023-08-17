interface Studentfee 
{ 
void getAmount(int clgfee); 
void getFirstname(String fname); 
void getLastname(String lname); 
void getAddress(String address); 
void getContact(double contact); 
} 
class Hostler implements Studentfee 
{ 
public void getAmount(int clgfee) 
{
int hostelfee=5000; 
System.out.println("fee payed by hostler:"+(clgfee+hostelfee)); 
} 
public void getFirstname(String fname) 
{
System.out.println("first name of the student:"+fname); 
} 
public void getLastname(String lname) 
{
System.out.println("last name of the student:"+lname); 
} 
public void getAddress(String address) 
{
System.out.println("Address of the student:"+address); 
} 
public void getContact(double contact) 
{
System.out.println("contact number of the student:"+contact); 
} 
} 
class NonHostler implements Studentfee 
{ 
public void getAmount(int clgfee) 
{ 
System.out.println("fee payed by nonhostler:"+(clgfee)); 
} 
public void getFirstname(String fname) 
{
System.out.println("first name of the student:"+fname); 
} 
public void getLastname(String lname) 
{
System.out.println("last name of the student:"+lname); 
} 
public void getAddress(String address) 
{
System.out.println("Address of the student:"+address); 
} 
public void getContact(double contact) 
{
System.out.println("contact number of the student:"+contact); 
} 
} 
class Main 
{ 
public static void main(String args[]) 
{ 
Studentfee h= new Hostler(); 
h.getAmount(23000); 
h.getFirstname("Mounika"); 
h.getLastname("Erra"); 
h.getAddress("Bhimaram,Mancherial,Telangana"); 
h.getContact(504204); 
System.out.println("\n"); 
Studentfee h1= new NonHostler(); 
h1.getAmount(20000); 
h1.getFirstname("Hyma"); 
h1.getLastname("Nilagiri"); 
h1.getAddress("Anakapally,vishakapatnam,Andhrapradesh"); 
h1.getContact(26064); 
} 
} 
