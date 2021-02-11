//Ricky Small
//Class to add numbers
//11/02/21
//g00352166@gmit.ie

package ie.gmit;

public class Calculator {

	private int firstNum;
	private int secondNum;
	private int result;

	public Calculator() {
		this.firstNum = 0;
		this.secondNum = 0;
	}

	// This method will add two numbers
	public Calculator(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	public int add(int numA, int numB){
		result = numA + numB;
		return result;
	}
}
