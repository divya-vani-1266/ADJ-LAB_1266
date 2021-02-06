package collections;

import java.util.Hashtable;
import java.util.Map;

public class hashtabl {
	public static void main(String[] args) {
		Hashtable<Integer, String> ob=new Hashtable<Integer,String>();
		ob.put(1,"elephant");
		ob.put(2,"lion");
		ob.put(3,"tiger");
		System.out.println("Hash table size = "+ob.size());
		System.out.println("Hash table is = "+ob);
		for(Map.Entry m:ob.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
