package Package1;

import java.util.*;
/*only for listIterators
 * 
 * hasNext();
 * next()
 * hasPrevious()
 * previous()
 */

public class Class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/// list iterator
		ArrayList<String> names = new ArrayList<String>();
		names.add("narsa");
		names.add("naresh");
		names.add("sathish");
		names.add("naveen");
		names.add("anil");
		names.remove(2);
		ListIterator<String> itr = names.listIterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		System.out.println("***************************");
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("***************************");

		
		HashSet<String> name = new HashSet<String>(5);
		name.add("narsa reddy");
		name.add("narsa reddy");
		name.add("sathish reddy");
		name.add("naveen reddy");
		name.add("anil reddy");
		Iterator<String> itrr = name.iterator();
		while(itrr.hasNext())
			System.out.println(itrr.next());

		
	}

}
