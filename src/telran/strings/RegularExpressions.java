package telran.strings;

public class RegularExpressions {
	public static String javaVariable() {
		String regex = "[A-Za-z$][\\w$]*|_[\\w$]+";
		
		return regex;
	}
	
	public static String zero_300() {
		String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0";
		
		return regex;
	}
	
	public static String ipOctet() {
		//contains 1 - 3 symbols presenting number from 0 - 255; 
		//leading zeros are allowed
		String regex = "[0-1]\\d{0,2}|2[0-4]\\d|25[0-5]";
		
		return regex;
	}
}
