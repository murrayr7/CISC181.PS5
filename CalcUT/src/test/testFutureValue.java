package test;

import static org.junit.Assert.*;

import org.junit.Test;

import CISC181.Calcengine.Calculator;

public class testFutureValue {

	@Test
	public void testFutureVal1() {
		assertEquals(11022.6616064735,Calculator.futureVal(10000, 3.25, 3),.0000000001);
	}
	@Test
	public void testFutureVal2() {
		assertEquals(10746.1668293926,Calculator.futureVal(10000, 1.2, 6),.0000000001);
	}

}
