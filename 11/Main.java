package oldu11;

public class Main {

	public static void main(String[] args) {
		// erstes Beispiel
		ListStack firstStack = new ListStack();
		firstStack.push(new Operator('+'));
		firstStack.push(new Operand(2));
		firstStack.push(new Operator('*'));
		firstStack.push(new Operand(3));
		firstStack.push(new Operand(5));
		// zweitens Beispiel
		ListStack secondStack = new ListStack();
		secondStack.push(new Operator('*'));
		secondStack.push(new Operator('-'));
		secondStack.push(new Operand(2));
		secondStack.push(new Operand(3));
		secondStack.push(new Operand(5));
		// Drittens Beispiel
		ListStack thirdStack = new ListStack();
		thirdStack.push(new Operator('*'));
		thirdStack.push(new Operator('+'));
		thirdStack.push(new Operand(4));
		thirdStack.push(new Operand(3));
		thirdStack.push(new Operator('-'));
		thirdStack.push(new Operand(2));
		thirdStack.push(new Operand(5));

		//UPN Auswerter erstellen
		UpnAuswerter auswerter = new UpnAuswerter();

		//im Console ausdrucken
		System.out.println(auswerter.auswerten(firstStack));

		System.out.println(auswerter.auswerten(secondStack));

		System.out.println(auswerter.auswerten(thirdStack));
		}

}

