package collections;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args){
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(22);
		ob.add(31);
		ob.add(14);
		ob.add(151);
		ob.add(344);
		System.out.println("Arraylist after insertion:"+ob);
		ob.remove(4);
		System.out.println("Array list after remobing 344(using index value):"+ob);
		ob.add(2,0);
		System.out.println("Arraylist after adding new element at 2nd index with 0:"+ob);
	}

}