package constructor;

public class sample1 
{
int a;
int b;
int m;

sample1 ()
{
 a=50;
 b=30;
}

sample1 (int c, int d)
{
a=c;
b=d;
	}
sample1 (int c, int d, int l)
{
a=c;
b=d;
m=l;	
}
public void addition ()
{
System.out.println(m+a+b);
System.out.println("running non static method : m1");
System.out.println(a*b*m);	
}


}
