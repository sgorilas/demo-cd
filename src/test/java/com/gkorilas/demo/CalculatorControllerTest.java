package com.gkorilas.demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gkorilas on 18/5/2017.
 */
public class CalculatorControllerTest {

	CalculatorController ctrl = new CalculatorController();

	@Test
	public void testSum(){
		Assert.assertEquals(2, ctrl.sum(1, 1));
	}
}
