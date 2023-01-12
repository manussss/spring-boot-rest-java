package br.com.branq.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.branq.services.DivideOperation;
import br.com.branq.services.MathOperation;
import br.com.branq.services.MultiplyOperation;
import br.com.branq.services.SubtractOperation;
import br.com.branq.services.SumOperation;

@RestController
public class MathController {
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(value = "numberOne") Double numberOne, @PathVariable(value = "numberTwo") Double numberTwo) {
		MathOperation operator = new SumOperation();
		
		return operator.doMathOperation(numberOne, numberTwo);
	}
	
	@GetMapping("/subtract/{numberOne}/{numberTwo}")
	public Double subtract(@PathVariable(value = "numberOne") Double numberOne, @PathVariable(value = "numberTwo") Double numberTwo) {
		MathOperation operator = new SubtractOperation();
		
		return operator.doMathOperation(numberOne, numberTwo);
	}
	
	@GetMapping("/divide/{numberOne}/{numberTwo}")
	public Double divide(@PathVariable(value = "numberOne") Double numberOne, @PathVariable(value = "numberTwo") Double numberTwo) {
		MathOperation operator = new DivideOperation();
		
		return operator.doMathOperation(numberOne, numberTwo);
	}
	
	@GetMapping("/multiply/{numberOne}/{numberTwo}")
	public Double multiply(@PathVariable(value = "numberOne") Double numberOne, @PathVariable(value = "numberTwo") Double numberTwo) {
		MathOperation operator = new MultiplyOperation();
		
		return operator.doMathOperation(numberOne, numberTwo);
	}
}
