package edu.sjsu.cs151.spr2018.javafxlab.model;

public class CalculatorModel {
	
	// TODO(you): Add a collection of ModelListeners
	
	// state information
	boolean firstNumber = true;
	boolean hasOp = false;
	
	private double op1;
	private double op2;
	private double result;
	private String operator;
	private String inputString = "";
	
	// TODO(you): Create a ModelListener interface with just one function update()
	// and uncomment the following.
	// HINT: It would be useful for update to take a double as the parameter for update() 
	// so you can pass the result 
	
	/* 
	  public void attach(ModelListener listener) {
		listeners.add(listener);
	} */
	
	
	private void updateAll() {
		//TODO(you): Iterate through the listener collection and call update on each of them.
		// Use the for each iteration. 
	}
	
	public void handleInput(String text) {
		switch(text) {
			case "+": 
			case "-": 
			case "/": 
			case "*": 
				this.operator = text;
				hasOp = true;
				firstNumber = false;
				inputString = "";
				break;
			case "=":
				if (hasOp) {
					result = calculate();
					hasOp = false;
					firstNumber = true;
					inputString = "";
				}
				break;
			case "AC": 
			case "±": 
			case "%":
			case ".":
				throw new UnsupportedOperationException("Not implemented yet");
			
			default: 
				inputString = inputString+text;
				if (firstNumber) {
					this.op1 = Integer.parseInt(inputString);
				} else {
					this.op2 = Integer.parseInt(inputString);
				}
				result = Double.parseDouble(inputString);		
		}
		updateAll();
	}

	private double calculate() {
		double res = 0;
		// TODO(you): implement the switch case for calculation.
		return res;
	}
	

	double getResult() {
		return result;
	}

}
