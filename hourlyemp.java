class contractemployee 
{ 
String desig; 
double salary; 
public void setDesignation(String desig) 
{ 
this.desig=desig; 
} 
public String getdesignation() 
{ 
return desig; 
}} 
class hourlyemp extends contractemployee 
{ 
int hours,wageph; 
hourlyemp(String design,int hours,int wageph) 
{ 
super.setDesignation(design); 
this.hours=hours; 
this.wageph=wageph; 
} 
int calwages() 
{ 
return hours*wageph*30; 
} 
public String getDesignation() 
{ 
return super.desig; 
} 
} 
class Weeklyemp extends contractemployee 
{ 
int weeks,wagespwk; 
Weeklyemp(String design,int weeks,int wagepwk) 
{ 
super.setDesignation(design); 
this.weeks=weeks; 
this.wagespwk=wagespwk; 
} 
int calwages() 
{ 
return weeks*wagespwk*30; 
} 
public String getDesignation() 
{ 
return super.desig; 
} 
} 
class w6_4 
{ 
public static void main(String a[]) 
{ 
hourlyemp he=new hourlyemp("Electrician",10,75); 
System.out.println("Hourly emp monthly salary "+he.calwages()); 
System.out.println("Hourly emp desig "+he.getdesignation()); 
} 
} 
