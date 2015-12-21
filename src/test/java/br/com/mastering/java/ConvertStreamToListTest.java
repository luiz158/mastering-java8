package br.com.mastering.java;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class ConvertStreamToListTest {

	@Test
	public void shouldConvertAStreamToList() throws Exception {
		List<String> streamOfStrings = Arrays.asList("First string", "Second string", "Third string");
		
		List<String> listOfStrings = streamOfStrings.stream().collect(Collectors.toList());
		
		assertEquals("First string", listOfStrings.get(0));
		assertEquals("Second string", listOfStrings.get(1));
		assertEquals("Third string", listOfStrings.get(2));
	}
	
}
