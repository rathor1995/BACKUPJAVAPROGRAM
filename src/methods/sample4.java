package methods;

public class sample4
{
public static void main(String[] args) {
	System.out.println("main method started");
	sample4 s1 = new sample4 ();
	s1.m4();
	s1.m5();
	
	
	System.out.println("main method ended");
}

public void m4() 
{
System.out.println("runninng non ststic method from same class:m4");	
}
public void m5() 
{
System.out.println("runninng non ststic method from same class:m5");	
}

}
