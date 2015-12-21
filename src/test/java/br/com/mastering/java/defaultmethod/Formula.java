package br.com.mastering.java.defaultmethod;

//The compiler will throws a compiler error if we have more than one abstract method here
@FunctionalInterface
public interface Formula {

	double calculate(int a); //we can have just one abstract method
	
	default double anotherDefaultMethod(int a) {
		return a;
	}
	
	default double sqrt(int a) {
		return Math.sqrt(a);
	}
	
}
