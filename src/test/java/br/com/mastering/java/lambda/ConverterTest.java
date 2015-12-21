package br.com.mastering.java.lambda;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mastering.java.defaultmethod.Converter;

public class ConverterTest {

	@Test
	public void shouldUseConverterInterfaceWithoutUseLambdaExpression() throws Exception {
		Converter<String, Integer> converter = new Converter<String, Integer>() {
			
			@Override
			public String convert(Integer from) {
				return from.toString();
			}
		};
		
		String converted = converter.convert(10);
		
		assertEquals("10", converted);
	}
	
}
