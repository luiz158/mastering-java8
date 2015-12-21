package br.com.mastering.java.lambda;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class LambdaExpressionTest {

	@Test
	public void shouldSortStringsWithoutLambda() throws Exception {
		List<String> names = Arrays.asList("Gama", "Bruna", "Carlos", "Gustavo");
		
		Collections.sort(names, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		
		assertEquals("Bruna", names.get(0));
		assertEquals("Carlos", names.get(1));
		assertEquals("Gama", names.get(2));
		assertEquals("Gustavo", names.get(3));
	}
	
}
