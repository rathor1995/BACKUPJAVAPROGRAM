package variable;

public class TestNonStaticVariable 
{
public static void main(String[] args) 
{
NonStaticVariable ns = new NonStaticVariable();
int c = ns.a;
System.out.println(c);
}
}
