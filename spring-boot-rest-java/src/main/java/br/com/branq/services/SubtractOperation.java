package br.com.branq.services;

public class SubtractOperation extends MathOperation {

	@Override
	public Double doMathOperation(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}

}
