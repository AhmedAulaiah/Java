package oldu11;
/*

 */
public class UpnAuswerter {
    private ListStack zweiteStack = new ListStack();

    //Klasse Construktor
    public UpnAuswerter() {
    }

    public int auswerten(ListStack stack) {
        while (!stack.isEmpty()) {
            Object objectOfStack = stack.pop();
            // wenn die objekt operand ist dann wird in Stack gepucht
            if (objectOfStack instanceof Operand) {
                zweiteStack.push(objectOfStack);
            }
            // nimmt zwei zwei oprande von der stack und berechnet sie mit dem operator
            // dann pucht die resultat in der stack
            else {
                    Operator theOperator = (Operator) objectOfStack;
                    int firstNum = ((Operand) zweiteStack.pop()).getOperand();
                    int secondNum = ((Operand) zweiteStack.pop()).getOperand();
                    switch (theOperator.getOperator()) {
                        case '+':
                            stack.push(new Operand(secondNum + firstNum));
                            break;
                        case '-':
                            stack.push(new Operand(secondNum - firstNum));
                            break;
                        case '*':
                            stack.push(new Operand(secondNum * firstNum));
                            break;
                        case '/':
                            stack.push(new Operand(secondNum / firstNum));
                            break;
                    }

            }
        }
        return ((Operand) zweiteStack.pop()).getOperand();

    }



}