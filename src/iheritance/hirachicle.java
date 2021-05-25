package iheritance;

public class hirachicle 
{
public static void main(String[] args) {
	System.out.println("properties of son 1");
	
	son1 s1 = new son1();
	s1.bike();
	s1.car();
	s1.money();
	s1.home();
	
	
System.out.println("properties of son 2");
	
	son2 s2 = new son2();
	s2.mobile();
	s2.car();
	s2.money();
	s2.home();
}
}
