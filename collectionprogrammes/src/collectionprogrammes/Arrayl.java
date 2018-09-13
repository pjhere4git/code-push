package collectionprogrammes;

import java.util.ArrayList;
import java.util.Iterator;


public class Arrayl {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("A");
		al.add("b");
		al.add("c");
		for(String it:al){
			System.out.println(it);
		}
		/*al.remove("b");
		Iterator it= al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/

	}

}
