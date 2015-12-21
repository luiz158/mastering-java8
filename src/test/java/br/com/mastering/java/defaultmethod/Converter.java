package br.com.mastering.java.defaultmethod;

public interface Converter<T, F> {

	T convert(F from);
	
}
