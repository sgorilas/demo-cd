package com.gkorilas.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by gkorilas on 18/5/2017.
 */
@RestController
@RequestMapping("/demo/calc")
public class CalculatorController {

	@RequestMapping("/sum")
	public int sum(@RequestParam(value = "num1") int num1, @RequestParam(value = "num2") int num2) {
		return num1+num2;
	}

}
