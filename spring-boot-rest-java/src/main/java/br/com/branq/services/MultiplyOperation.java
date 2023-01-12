package br.com.branq.services;

public class MultiplyOperation extends MathOperation {

	@Override
	public Double doMathOperation(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}

}
