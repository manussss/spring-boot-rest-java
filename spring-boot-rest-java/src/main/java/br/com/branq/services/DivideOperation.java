package br.com.branq.services;

public class DivideOperation extends MathOperation {

	@Override
	public Double doMathOperation(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}

}
