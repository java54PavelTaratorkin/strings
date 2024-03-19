package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import telran.strings.Validations;

class ValidationsTest {

	@Test
	@DisplayName("test if string is regular expression & has ")
	void testIsArithmeticExpression() {
		assertTrue(Validations.isArithmeticExpression("(20.5 + abc)*2"));
		assertTrue(Validations.isArithmeticExpression("((20.5 + abc))*2"));
		assertTrue(Validations.isArithmeticExpression("( 20.5 + abc  )*2"));
		assertTrue(Validations.isArithmeticExpression("( 20.5 + abc / 3)*2 +(2*5)"));
		assertTrue(Validations.isArithmeticExpression("(20.5 + abc$ / 3)* 2"));
		assertTrue(Validations.isArithmeticExpression("(20.5 + abc12 / 3)*2"));
		assertTrue(Validations.isArithmeticExpression("(abc)"));
		assertTrue(Validations.isArithmeticExpression("(___)"));
		
		assertFalse(Validations.isArithmeticExpression("(20.5 + abc))*2"));
		assertFalse(Validations.isArithmeticExpression(")(20.5 + abc))*2"));
		assertFalse(Validations.isArithmeticExpression("((20.5 + abc))*(2"));
		assertFalse(Validations.isArithmeticExpression("2 + _"));
		assertFalse(Validations.isArithmeticExpression("2 + a12 * "));
		assertFalse(Validations.isArithmeticExpression("2 + )a12")); 
		assertFalse(Validations.isArithmeticExpression("(2 + )a12 *"));		
		assertFalse(Validations.isArithmeticExpression("2 +() 3"));
		assertFalse(Validations.isArithmeticExpression("(20.5 + abc))*2"));
	}

}
