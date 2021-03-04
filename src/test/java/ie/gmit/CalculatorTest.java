package ie.gmit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator myCalc;
	@BeforeEach
	void init() {
		myCalc = new Calculator();
	}
	@Test
	void testAdd()
	{
		int result = myCalc.add(10,20);
		assertEquals(30, result, 0);
	}

	@Test
	void testSub()
	{
		int result = myCalc.sub(20,10);
		assertEquals(10, result, 0);
	}

	@Test
	void testMultiply()
	{
		double result = myCalc.multiply(6,2);
		assertEquals(12, result, 0);
	}

	@Test
	void testDivide()
	{
		double result = myCalc.divide(10,5);
		assertEquals(2, result, 0);
	}

	@Test
	void testDivideByZero()
	{
		Exception e = assertThrows(ArithmeticException.class, ()-> myCalc.divide(10,0));
		assertEquals("/ by zero", e.getMessage());
	}

}
