package U12;

import java.util.ArrayList;

public class Main {

	/**
	 * Exectutes program. 
	 * @param args
	 */
	public static void main(String[] args) {


		// Neue List von Strings erzuege und String Werte hinzufügen...
		DoubleLinkedList<String> firstList= new DoubleLinkedList<>();
		firstList.add("One");
		firstList.add("Two");
		firstList.add("Three");
		firstList.add("Four");
		firstList.add("Five");

		// printing the List in the Console.
		System.out.println(firstList);
		System.out.println();


		// Inserting element at index.
		firstList.insert("Six", 2);
		System.out.println(firstList);
		System.out.println();

		// Deleting an Element from list.
		firstList.delete(3);
		System.out.println(firstList);
		System.out.println();

		// Finding an Element in a list.
		System.out.println(firstList.get(2)+ "<-" +" ist in dem List gefunden ");
		System.out.println(firstList);
		System.out.println();

		// Returning element index.
		firstList.indexOf("Four");
		System.out.println(firstList);
		System.out.println();

		// Length of a list.
		System.out.println("Length of List " + firstList+" ist " +firstList.length());
		System.out.println();


		// Neue List erzuege und Integer Werte hinzufügen..
		DoubleLinkedList<Integer> listTwo = new DoubleLinkedList<>();
		listTwo.add(1);
		listTwo.add(2);
		listTwo.add(3);
		listTwo.add(4);
		listTwo.add(5);
		System.out.println(listTwo);
		System.out.println();

		// Vergleiche Zwei Liste.
		System.out.print("" +listTwo +" ist gleich " +firstList + " : ");
		//System.out.println(listTwo.equals(firstList));
		System.out.println();

		DoubleLinkedList<Integer> listThree = new DoubleLinkedList<>();
		listThree.add(100);
		listThree.add(200);
		listThree.add(300);
		listThree.add(400);
		listThree.add(500);
		System.out.println(listThree);
		System.out.println();

		// Vergleiche Zwei Liste.
		System.out.print("" +listTwo +" ist gleich " +listThree + " : ");
		System.out.println(listTwo.equals(listThree));
		System.out.println();

		DoubleLinkedList<Integer> thirdlist = new DoubleLinkedList<>();
		thirdlist.add(100);
		thirdlist.add(200);
		thirdlist.add(300);
		thirdlist.add(400);
		thirdlist.add(500);

		ArrayList<Integer> p = new ArrayList<>();
		ArrayList<Integer> j = new ArrayList<>();
		p.equals(j);


		System.out.println(thirdlist);
		System.out.println(thirdlist.equals(listThree));

	}

}


