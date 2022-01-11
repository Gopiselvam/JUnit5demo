package com.test.service;

public class Calculator {
	public int addition(int a, int b) {
		return a + b;
	}
	public int multiplication(int a, int b) {
		return a * b;
	}
	public int subtraction(int a, int b) {
		return a - b;
	}
	public int division(int a, int b) {
		return a / b;
	}

	public int modulus(int a, int b){
		return a % b;
	}


	public Integer convertToNumber(String romanSymbol) {
		Integer num;
		switch (romanSymbol) {
			case "I":
				num = 1;
				break;
			case "V":
				num = 5;
				break;
			case "X":
				num = 10;
				break;
			case "L":
				num = 50;
				break;
			case "C":
				num = 100;
				break;
			case "D":
				num = 500;
				break;
			case "M":
				num = 1000;
				break;
			default:
				num = null;
		}
		return num;
	}

}