package Exception_handling;

import java.util.InputMismatchException;

public class sample1 
{
public static void main(String[] args) 
{
	
	int a =10;
	int b =0;
	int c= 0;
	
	try
	{c=a/b;}
	catch(ArrayIndexOutOfBoundsException e)
	{
		c=a/1;
System.out.println("ArrayIndexOutOfBoundsException found");

	}
	catch(InputMismatchException e)
	{
		c=a/1;
		System.out.println("generic exception found");
	}
	catch(Exception e)
	{
		c=a/1;
		System.out.println("generic exception found");
	}
	
	System.out.println(c);
	
	System.out.println("hii");
}
}
