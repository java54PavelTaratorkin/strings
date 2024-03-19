package telran.strings;

public class Validations {
	public static boolean isArithmeticExpression(String expression) {
		//1. Checking against the regular expression
		//2. Checking brackets pairness For each '(' there should be ')"
		//consider introducing counter that increased for '(' and decreased for ')'
		//if during passing over the string expression counter < 0 returning false
		//if after passing whole string counter != 0 returning false
		String regex = RegularExpressions.arithmeticExpression();
		boolean isRegex = expression.matches(regex);

		int countPairness = 0, i = 0;
		while (countPairness >=0 && i < expression.length()) {
			if (expression.charAt(i) == '(') {
				countPairness++;
			} else if (expression.charAt(i) == ')')
				countPairness--;
			i++;
		} ;
		
		boolean noPairness = countPairness == 0 ? true : false;
		
		return isRegex && noPairness;
	}
}
