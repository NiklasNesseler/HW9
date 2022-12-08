package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.Assert.*;
import java.lang.Exception;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		int expectedResults = 2 + 3;
		int actualResult = calculator.add(2, 3);

		assertEquals(5, calculator.add(2,3));
		assertEquals(69, calculator.add(33,36));
		assertFalse(3 + 3 == calculator.add(3,4));
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		assertEquals(-1, calculator.sub(2,3));
		assertEquals(-3, calculator.sub(33,36));
		assertFalse(1 == calculator.sub(3,3));
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		assertEquals(6, calculator.multiply(2,3));
		assertEquals(33*36, calculator.multiply(33,36));
		assertFalse(8 == calculator.multiply(3,4));
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		Assertions.assertEquals((float)3 / 3, (double)calculator.divide(3,3));
		Assertions.assertEquals((float)33 / 36, (double)calculator.divide(33,36));
		assertFalse(5 == calculator.divide(3,4));
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
			calculator.divide(1, 0)
					, "ZeroDivisionError");

	}
}
