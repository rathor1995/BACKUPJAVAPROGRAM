package COLLECTION;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class _linkedlist 
{
public static void main(String[] args)
{
	LinkedList ll = new LinkedList();
	ll.add("ganesh");
	ll.add(100);
	ll.add('A');
	ll.add(100);
	ll.add(null);
	ll.add(null);
	
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	System.out.println(ll.contains(100));
	System.out.println(ll.get(3));
	System.out.println(ll);
	
	ll.add(3,500);
	System.out.println(ll.get(3));
	System.out.println(ll.get(4));
	System.out.println(ll);

	

ll.remove(3);
System.out.println(ll);


ll.set(2, 'B');
System.out.println(ll);

System.out.println("---print all info in arraylist using Iterator cursor-----");
Iterator itr = ll.iterator();
while(itr.hasNext())
{System.out.println(itr.next());}

System.out.println("----Print all info in arraylist using liIterator cursor-----");
ListIterator litr = ll.listIterator();
{System.out.println(litr.next());}


System.out.println("----Print all the info in arraylist using for loop");
for(int i=0;i<=ll.size()-1;i++)
{System.out.println(ll.get(i));}

System.out.println("----Print all the info in arraylist using for-each loop");
for(Object s1: ll)
{System.out.println(s1);}


}
	
}
