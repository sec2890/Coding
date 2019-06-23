package CalculatorOne;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator testCalc1 = new Calculator(10.5,"+",5.2);

		testCalc1.performOperation();

		testCalc1.getResults();
	
	}
}
