package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.strings.Validations;

class ValidationsTest {

	@Test
	void testIsArithmeticExpression() {
		//TODO
		assertFalse(Validations.isArithmeticExpression("2 +() 3"));
		assertFalse(Validations.isArithmeticExpression("(20.5 + abc))*2"));
	}

}
