class vehicle 
{ 
int vno; 
int ino; 
String color; 
double fuel; 
void setinfo(int vno,int ino,String color) 
{ 
this.vno=vno; 
this.ino=ino; 
this.color=color; 
} 
void getconsumption(double fuel) 
{ 
this.fuel=fuel; 
} 
void displayconsumption() 
{ 
System.out.println("fuel consumption:"+fuel); 
} 
void displayinfo(){ 
System.out.println("Vehicle "+vno); 
System.out.println("Insurance no: "+ino); 
System.out.println("color "+color); 
} 
} 
class twowheeler extends vehicle 
{ 
double avg; 
double mt; 
void setspecs(double avg,double mt) 
{ 
this.avg=avg; 
this.mt=mt; 
} 
double getmaintenance() 
{ 
return mt; 
} 
double getaverage() 
{ 
return avg; 
} 
} 
class geared extends twowheeler 
{ 
String type; 
String name; 
geared(String type,String name) 
{ 
this.type=type; 
this.name=name; 
} 
String gettype() 
{ 
return type; 
} 
String getname() 
{ 
return name; 
} 
} 
class nongeared extends twowheeler 
{ 
String type; 
String name; 
nongeared(String type,String name) 
{ 
this.type=type; 
this.name=name; 
} 
String gettype() 
{ 
return type; 
} 
String getname() 
{ 
return name; 
} 
} 
class vehiclem 
{ 
public static void main(String args[]) 
{ 
twowheeler tw=new twowheeler(); 
tw.setinfo(1490,123432,"Blue"); 
tw.getconsumption(5); 
tw.setspecs(55,1200); 
double m=tw.getmaintenance(); 
double av=tw.getaverage(); 
System.out.println("for two wheelers"); 
tw.displayinfo(); 
tw.displayconsumption(); 
System.out.println("maintenance: "+m); 
System.out.println("average "+av); 
geared g=new geared("geared","motorcycle"); 
String type=g.gettype(); 
String name=g.getname(); 
System.out.println("\n type:"+type+"\n name:"+name); 
nongeared ng=new nongeared("non-geared","motorcycle"); 
 type=ng.gettype(); 
 name=ng.getname(); 
System.out.println("\n type:"+type+"\n name:"+name); 
} 
}