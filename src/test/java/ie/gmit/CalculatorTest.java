package ie.gmit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void testAdd()
	{
		Calculator myCalc = new Calculator();
		int result = myCalc.add(10,20);
		assertEquals(30, result, 0);
	}

	@Test
	void testSub()
	{
		Calculator myCalc = new Calculator();
		int result = myCalc.sub(20,10);
		assertEquals(10, result, 0);
	}

	@Test
	void testMultiply()
	{
		Calculator myCalc = new Calculator();
		double result = myCalc.multiply(6,2);
		assertEquals(12, result, 0);
	}

	@Test
	void testDivide()
	{
		Calculator myCalc = new Calculator();
		double result = myCalc.divide(10,5);
		assertEquals(2, result, 0);
	}
}
