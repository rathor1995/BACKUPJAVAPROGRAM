package methods;

public class sample9
{
public static void main(String[] args)
{
guest();
System.out.println("---------");
admin("abc1","xyz");
test(10,"ganesh",'A');
}	
public static void test(int rollno, String name, char grade)
{
System.out.println("----student info------");	
System.out.println(rollno);
System.out.println(name);
System.out.println(grade);
}

public static void guest()
{
System.out.println("login to pc using guest account");
String un= "abc";
String pwd= "xyz";
System.out.println(un);
System.out.println(pwd);

}
public static void admin (String UN, String pwd)
{
System.out.println("login to pc using admin account");
System.out.println(UN);
System.out.println(pwd);
}


}

