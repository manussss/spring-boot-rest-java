package br.com.branq.services;

public class SumOperation extends MathOperation{

	@Override
	public Double doMathOperation(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}

}
