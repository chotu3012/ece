class emp 
 { 
 String first_name ; 
 String last_name; 
 
 void getfirstname(String g) 
 { 
 first_name =g; 
 System.out.println("first name is:" +g); 
 } 
 void getlastname(String h) 
 { 
 last_name =h; 
 System.out.println("last name is :"+h); 
 } 
 } 
 
 class contractemp extends emp 
 { 
 String department ; 
 String designation; 
 String fullname; 
 
 void displayfullname(String a) 
 { 
 fullname = a; 
 System.out.println("full name of contract employ is :"+a); 
 } 
 void department(String b) 
 { 
 department = b; 
 System.out.println("department of contract employ is :"+b); 
 } 
 void designation(String c) 
 { 
 designation = c; 
 System.out.println("designation of contract employ is :"+c); 
 } 
 } 
 class regularemp extends emp 
 { 
 String department ; 
 String designation; 
 String fullname; 
 void displayfullname(String d) 
 { 
 fullname = d; 
 System.out.println("regular employ full name is:"+d); 
 } 
 void department(String e) 
 { 
 department = e; 
 System.out.println("department of regular employ is:"+e); 
 } 
 void designation(String f) 
 { 
 designation =f; 
 System.out.println("designation of regular employ is:"+f); 
 } 
 } 
 class employ 
 { 
 public static void main(String args[]) 
 { 
 emp e1= new emp(); 
 
 e1.getfirstname("Mounika"); 
 e1.getlastname("Erra"); 
 contractemp c1= new contractemp(); 
 c1.displayfullname("Mounika"); 
 c1.department("management"); 
 c1.designation("software"); 
 
 regularemp r1= new regularemp(); 
 r1.displayfullname("Radhika"); 
 r1.department("web_dept"); 
 r1.designation("software"); 
 } 
}