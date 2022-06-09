package com.datastructures.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ls = new LinkedList();
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.add(7);
		ls.add(8);
		ls.addFirst(3);
		ls.addFirst(2);
		ls.addFirst(1);
		ls.addEnd(9);
		ls.add(3, 1234568);
		ls.add(8, 12205);
		ls.add(1, 0);
		

//		ls.remove(1);
		ls.edit(3, 100);
		ls.edit(8, 1000000);

		ls.edit(30, 100);
		System.out.println("The element of index  :" + ls.inexOf(7).getData());
		
		
		 
		ls.print();
		
		System.out.println("Element Of :" +ls.elementOf(6));

		// System.out.println(ls.find(71));
		
		System.out.println("The size of linkedList :"+ls.size());
		
		ls.clear();
		
		System.out.println("After clear ");
		ls.print();
		System.out.println("The size is "+ls.size());

	}

}
