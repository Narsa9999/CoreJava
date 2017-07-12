package Package2;

import java.util.LinkedList;

public class Class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//LinkedList
		LinkedList<String> name = new LinkedList<String>();
		name.add("narsa");
		name.add("arun");
		name.add("naveen");
		name.add("anil");
		name.addFirst("mahendher");
		name.addLast("sathish");
		name.remove(1);
		name.set(0, "Mahendhar Reddy");
		for(String x : name)//in lists for loop is used to print all data
			System.out.println(x);
		System.out.println(name.size());
		/*System.out.println("********************************");
		name.removeFirst();
		name.removeLast();
		for(String x : name)//in lists for loop is used to print all data
			System.out.println(x);*/

		
	}

}
