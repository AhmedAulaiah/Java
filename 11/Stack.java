package oldu11;

public interface Stack {

	/**
	 * Packt ein Object auf den Stack.
	 * 
	 * @param obj
	 *            Das Object, das auf den Stack gepackt werden soll.
	 */
	public void push(Object obj);

	/**
	 * Gibt das oben auf dem Stack liegende Object zurück.
	 * 
	 * @return Das oben auf dem Stack liegende Object.
	 */
	public Object peek();

	/**
	 * Liefert das oben auf dem Stapel liegende Objekt zurück und entfernt es
	 * dabei vom Stapel.
	 * 
	 * @return Das oben auf dem Stack liegende Object.
	 */
	public Object pop();

	/**
	 * Gibt true zurück, wenn der Stack leer ist.
	 * 
	 * @return Gibt true zurück, wenn der Stack leer ist.
	 */
	public boolean isEmpty();

}

