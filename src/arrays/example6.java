package arrays;

import java.util.Arrays;

public class example6 
{
	public static void main(String[] args)
	{
		int ar [] = {10,50,40,30,20,10};
		System.out.println("-----orignal info-------");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);
	System.out.println("Asscending ordrt");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("Desscending ordrt");
	for(int i=ar.length-1;i>=0; i--)
	{
		System.out.println(ar[i]);
	}
	
	}
	
	
	
	
}
