package edu.sjsu.cs151.spr2018.javafxlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


// TODO(you): Currently all tests fail. Once you implement the calculate method in CalculatorModel
// these tests should pass.

class CalculatorModelTest {
	CalculatorModel model = new CalculatorModel();

	@Test
	void testHandleInputAdd() {
		model.handleInput("1");
		model.handleInput("+");
		model.handleInput("2");
		model.handleInput("=");
		assertEquals(3, model.getResult());
	}
	
	@Test
	void testHandleInputSubtract() {
		model.handleInput("1");
		model.handleInput("-");
		model.handleInput("2");
		model.handleInput("=");
		assertEquals(-1, model.getResult());
	}
	
	@Test
	void testHandleInputMult() {
		model.handleInput("1");
		model.handleInput("*");
		model.handleInput("2");
		model.handleInput("=");
		assertEquals(2, model.getResult());
	}
	
	@Test
	void testHandleInputDiv() {
		model.handleInput("1");
		model.handleInput("/");
		model.handleInput("2");
		model.handleInput("=");
		assertEquals(0.5, model.getResult());
	}
	
	@Test
	void testHandleInputUnsupported() {
		try {
			model.handleInput("1");
			model.handleInput(".");
			fail("Must throw exception");
		} catch (Exception e) {
			
		}
		
	}

}
