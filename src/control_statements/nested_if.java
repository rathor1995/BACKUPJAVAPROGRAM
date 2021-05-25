package control_statements;

public class nested_if 
{
public static void main(String[] args) 
{
String UN = "abc";
String PWD = "xyz";

if (UN== "abc")
{
	System.out.println("correct un");

      if (PWD == "xyz")
         {
	          System.out.println("correct passward");
              System.out.println("login successful");
         }
     else
         {
	         System.out.println("wrong passward");
             System.out.println("login fail");
         }
}
else
 {
    System.out.println("wrong un");
    System.out.println("login failed");
 }
}
}
