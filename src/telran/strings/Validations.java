package telran.strings;

public class Validations {
	public static boolean isArithmeticExpression(String expression) {
		//1. Checking against the regular expression
		//2. Checking brackets pairness For each '(' there should be ')"
		//consider introducing counter that increased for '(' and decreased for ')'
		//if during passing over the string expression counter < 0 returning false
		//if after passing whole string counter != 0 returning false
		
		/*
		 * countPairness >=0 && i < expression.length() - always index check 
		 * must be first. Though in this case no matter, but it should be rule 
		 * of thumb. You do the cycle regardless of expression matching - that 
		 * doesn't make a sense. countPairness == 0 ? true : false; is the same as 
		 * countPairness == 0 (no need of the conditional operator)
		 */
		String regex = RegularExpressions.arithmeticExpression();
		boolean isRegex = expression.matches(regex);

		int countPairness = 0;
		if (isRegex) {
			int i = 0, expLength = expression.length();	
			char[] characters = expression.toCharArray();
			while (i < expLength && countPairness >=0) {
				if (characters[i] == '(') {
					countPairness++;
				} else if (characters[i] == ')')
					countPairness--;
				i++;
			};
		}
		
		return isRegex && countPairness == 0;
	}
}
