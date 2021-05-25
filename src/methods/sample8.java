package methods;

public class sample8
{public static void main(String[] args)
{
System.out.println("main method started");	
addition (10,50);
sample8 mul = new sample8();
mul.multiplication(30, 20);
mul.addition1(44, 66);

System.out.println("main method ended");
}
public static void addition(int a, int b)

{
int c=a+b;
System.out.println("addition: "+c);
			
}
	
public void multiplication(int a, int b)

{
int c=a*b;
System.out.println("multiplication: "+c);
			
}	
public void addition1(int a, int b)

{int C = a+b;
	System.out.println("addition :"+C );}
}

