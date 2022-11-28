package U12;

public interface List<T> {
	/**
	 * fügt das Objekt obj an das Ende der Liste an.
	 * @param obj
	 */
	public void add(T obj);

	/**
	 * fügt das Objekt obj vor das an index-ter Stelle stehende Objekt in die Liste ein
	 * @param obj
	 * @param index
	 */
	public void insert(T obj, int index);

	/**
	 * liefert das an Indexposition index stehende Objekt der Liste zurück.
	 * @param index
	 * @return
	 */
	public Object get(int index);

	/**
	 * löscht das an Indexposition index stehende Objekt der Liste.
	 * @param index
	 */
	public void delete(int index);

	/**
	 * liefert die Indexposition des Objekts obj in der Liste zurück.
	 * Dazu werden die Objekte mit der equals-Methode der Listenobjekte auf Gleicheit getestet.
	 * @param obj
	 * @return
	 */
	public int indexOf(T obj);

	/**
	 * liefert die Länge der Liste zurück.
	 * @return
	 */
	public int length();
}
