package COLLECTION;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class _vector
{
public static void main(String[] args)
{
Vector V= new Vector();
V.add("ganesh");
V.add(100);
V.add('A');
V.add(null);
V.add(null);
	
System.out.println(V.capacity());	
System.out.println(V);
System.out.println(V.size());
System.out.println(V.isEmpty());
System.out.println(V.contains(100));
System.out.println(V.get(3));
System.out.println(V);

V.add(3,500);
System.out.println(V.get(3));
System.out.println(V.get(4));
System.out.println(V);

V.remove(3);
System.out.println(V);


V.set(2, 'B');
System.out.println(V);

System.out.println("---print all info in vector using Iterator cursor-----");
Iterator itr = V.iterator();
while(itr.hasNext())
{System.out.println(itr.next());}

System.out.println("----Print all info in vector using liIterator cursor-----");
ListIterator litr = V.listIterator();
{System.out.println(litr.next());}

System.out.println("----Print all the info in vector using for loop");
for(int i=0;i<=V.size()-1;i++)
{System.out.println(V.get(i));}

System.out.println("----Print all the info in vector using for-each loop");
for(Object s1: V)
{System.out.println(s1);}


System.out.println("----Print all the info in vector using enumeration cursor-----");
Enumeration en =V.elements();

while (en.hasMoreElements())
{System.out.println(en.nextElement());}


}
}
	
	

