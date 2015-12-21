package br.com.mastering.java.defaultmethod;

@FunctionalInterface
public interface Converter<T, F> {

	T convert(F from); //we can just have one abstract method
	
}
