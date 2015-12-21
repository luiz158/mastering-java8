package br.com.mastering.java.lambda;

import static org.junit.Assert.*;

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
	
	@Test
	public void shouldSortStringsUsingLambdaExpressionInALongWay() throws Exception {
		List<String> names = Arrays.asList("Gama", "Bruna", "Carlos", "Gustavo");
		
		Collections.sort(names, (String s1, String s2) -> {
			return s1.compareTo(s2);
		});
		
		assertEquals("Bruna", names.get(0));
		assertEquals("Carlos", names.get(1));
		assertEquals("Gama", names.get(2));
		assertEquals("Gustavo", names.get(3));
	}
	
	@Test
	public void shouldSortStringsUsingLambdaExpressionInAShortWay() throws Exception {
		List<String> names = Arrays.asList("Gama", "Bruna", "Carlos", "Gustavo");
		
		Collections.sort(names, (String s1, String s2) -> s1.compareTo(s2));
		
		assertEquals("Bruna", names.get(0));
		assertEquals("Carlos", names.get(1));
		assertEquals("Gama", names.get(2));
		assertEquals("Gustavo", names.get(3));
	}
	
	@Test
	public void shouldSortStringsUsingLambdaExpressionInAShortAndBestWay() throws Exception {
		List<String> names = Arrays.asList("Gama", "Bruna", "Carlos", "Gustavo");
		
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
		
		assertEquals("Bruna", names.get(0));
		assertEquals("Carlos", names.get(1));
		assertEquals("Gama", names.get(2));
		assertEquals("Gustavo", names.get(3));
	}

	
}
