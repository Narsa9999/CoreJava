package Package2;
import java.util.ArrayList;
public class Class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int simple_array[] = new int[5];// one type of array declaration
	ArrayList<Integer> mylist = new ArrayList<Integer>(5);
	mylist.add(1);
	mylist.add(5);
	mylist.add(58);
	mylist.add(120);
	mylist.add(93);
	mylist.add(100);
	for(Integer x:mylist)   //for is a loop generally but here its declaration says it takes all array values
		System.out.println(x);
System.out.println(mylist.size());
System.out.println("---------------------");
mylist.set(01, 500);
for(Integer x:mylist)   //for is a loop generally but here its declaration says it takes all array values
	System.out.println(x);
System.out.println(mylist.size());
System.out.println("---------------------");
mylist.remove(2);
for(Integer x:mylist)   //for is a loop generally but here its declaration says it takes all array values
	System.out.println(x);
System.out.println(mylist.size());
System.out.println("---------------------");
mylist.trimToSize();
for(Integer x:mylist)   //for is a loop generally but here its declaration says it takes all array values
	System.out.println(x);
System.out.println(mylist.size());
System.out.println("---------------------");
	}

}
