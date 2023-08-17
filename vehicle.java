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
class fourwheeler extends vehicle 
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
class vehiclemain 
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
fourwheeler fw=new fourwheeler(); 
fw.setinfo(9000,876646,"Silver"); 
fw.getconsumption(10); 
fw.setspecs(20,5000); 
m=fw.getmaintenance(); 
av=fw.getaverage(); 
System.out.println("for four wheelers"); 
fw.displayinfo(); 
fw.displayconsumption(); 
System.out.println("maintenance: "+m); 
System.out.println("average "+av); 
} 
}