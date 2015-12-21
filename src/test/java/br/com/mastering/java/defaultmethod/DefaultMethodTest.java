package br.com.mastering.java.defaultmethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class DefaultMethodTest {

	@Test
	public void shouldTestDefaultMethod() throws Exception {
		Formula formula = new Formula() {
			
			@Override
			public double calculate(int a) {
				return sqrt(a);
			}
		};
		
		double sqrtCalculated = formula.calculate(25);
		double anotherSqrtCalculated = formula.sqrt(16);
		
		assertEquals(5, sqrtCalculated, 0);
		assertEquals(4, anotherSqrtCalculated, 0);
	}
	
}
