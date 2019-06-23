package CalculatorOne;

public class Calculator {
	
	//The Attributes
	private Double operandOne = 0.0;
	private Double operandTwo = 0.0;
	private Double mathTotal = 0.0;
	private String operation = "";
	
	//The Constructors
	public Calculator() {
	}
	public Calculator(Double operandOne, String operation, Double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}
		
	//The Getters
	public Double getOperandOne() {
		return operandOne;
	}
	public Double getOperandTwo() {
		return operandTwo;
	}
	public Double getMathTotal() {
		return mathTotal;
	}
	public String getOperation() {
		return operation;
	}
	
	//The Setters
	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}
	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public void setMathTotal(Double mathTotal) {
		this.mathTotal = mathTotal;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	//The Methods
	public void performOperation() {
		if(getOperation().equals("+")) {
			Double total = getOperandOne() + getOperandTwo();
			setMathTotal(total);
		}
		if(getOperation().equals("-")) {
			Double total = getOperandOne() - getOperandTwo();
			setMathTotal(total);
		}
		if(getOperation().equals("/")) {
			Double total = getOperandOne() / getOperandTwo();
			setMathTotal(total);
		}
		
		else if(getOperation().equals("*")) {
			Double total = getOperandOne() * getOperandTwo();
			setMathTotal(total);
		}
	}
	
	public void getResults() {
		System.out.println(getMathTotal());
	}	
}