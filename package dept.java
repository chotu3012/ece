package dept; 
public class ECE 
{ 
public void Subjects() 
{ 
System.out.println("EMT\nDEC\nDSD\nAC\nDC"); 
} 
}
package dept; 
public class CSE 
{ 
public void Subjects() 
{ 
System.out.println("Java\nDM\nPPL\nDBMS\nCOA"); 
} 
}
package dept; 
public class CE 
{ 
public void Subjects() 
{ 
System.out.println("ED\nGraphics"); 
} 
}
package dept; 
public class ME 
{ 
public void Subjects() 
{ 
System.out.println("mechanics\nFlued Mechanics"); 
} 
}
import dept.ECE; 
import dept.CSE; 
import dept.CE; 
import dept.ME; 
public class Branches 
{ 
public static void main(String args[]) 
{ 
ECE ec=new ECE(); 
System.out.println("Subjects of ECE:"); 
ec.Subjects(); 
CSE cs=new CSE(); 
System.out.println("Subjects of CSE:"); 
cs.Subjects(); 
CE ce=new CE(); 
System.out.println("Subjects of CE:"); 
ce.Subjects(); 
ME me=new ME(); 
System.out.println("Subjects of ME:"); 
me.Subjects(); 
} 
