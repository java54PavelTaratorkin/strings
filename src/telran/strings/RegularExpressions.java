package telran.strings;

public class RegularExpressions {
	public static String javaVariable() {
		String regex = "[A-Za-z$][\\w$]*|_[\\w$]+";
		
		return regex;
	}
	
	public static String zero_300() {
		//TODO
		//string contains number from 0 - 300; leading zeros are disallowed
		String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0";
		
		return regex;
	}
}
