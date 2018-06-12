package com.javacodegeeks.examples.junitmavenexample;

public interface ICalculator {
	
	//sum
	int sum(int a, int b);

	int subtraction(int a, int b) throws Exception;

	int multiplication(int a, int b);

	int divison(int a, int b) throws Exception;

	boolean equalIntegers(int a, int b);
}