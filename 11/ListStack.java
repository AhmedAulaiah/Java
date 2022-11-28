package oldu11;

import java.util.ArrayList;

public class ListStack implements Stack {


	//private int pos = 0;  // The index of the first free slot.
	//private final int INITIAL_SIZE = 10;
	//private Object[] obj;

	//private Attribut der Klasse
	private ArrayList<Object> liste;


	/**
	 * No-arg Konstruktor, inititialisiert ein list for das Stack.
	 */
	public ListStack() {
		liste = new ArrayList<>();
	}


	/**
	 * Check if the stack does not contain any more elements.
	 *
	 * @return <code>true</code> if and only if there are not any elements on the stack.
	 */
	@Override
	public boolean isEmpty()
	{
		return liste.size() == 0;
	}



	/**
	 * Look at the element at the top of the stack without removing it.
	 *
	 * @return the value of the topmost element.
	 */
	@Override
	public Object peek(){
		if (!isEmpty()) {
			return liste.get(0);
		} else {
			return "Stack leer!";
		}
	}


	/**
	 * Remove the topmost element from the stack.
	 *
	 */
	@Override
	public Object pop() {
		if (!isEmpty()) {
			Object ob = liste.get(0);
			liste.remove(0);
			return ob;
		} else {
			return "Stack leer!";
		}
	}


	/**
	 * Push a new element onto the stack.
	 *
	 * @param obj the value of the new element.
	 * 
	 */
	@Override
	public void push(Object obj) {
		liste.add(0, obj);
	}  


	/**
	 * Convert the contents of the stack into a nice textual representation.
	 * A multi-line string is generated with one line per stack element,
	 * beginning with the topmost element.
	 */

	/*
	public String toString()
	{
		if(pos == 0)
			return "<empty>";

		StringBuffer stringBuffer = new StringBuffer();
		for(int i = pos - 1; i >= 0; i--)
		{
			stringBuffer.append(obj[i]);
			stringBuffer.append("\n");
		}

		return stringBuffer.toString();
	}

	 */


}
