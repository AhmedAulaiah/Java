package oldu11;

public class Operator {
	private char operator;

	public void setOperator(char operator) {
		this.operator = operator;
	}

	//Klasse Construktor
	public Operator(char operator) {
		this.operator = operator;
	}

	//getter methode
	public char getOperator() {
		return operator;
	}
	
	/**
	* toString-Methode
	*/
	public String toString() {
	return String.valueOf(operator);
	}
}