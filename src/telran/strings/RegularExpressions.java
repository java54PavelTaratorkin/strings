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
		//TODO
		//contains 1 - 3 symbols presenting number from 0 - 255; 
		//leading zeros are allowed
		
		return null;
	}
	
	public static String mobileIsraelPhone() {
		//TODO
		//string contains possible Israel mobile phone number
		//+972-(maybe without '-' but no space)<prefix two digit beginning from 5>-<7 digits of number>
		//<prefix three digits: first - 0, second 5, third - any>-(maybe without '-' but no space)<7 digits of number>
		//E.g. 054-733-44-58, 054-73344-58, 054-7334458, 054733-44-58, 0547334458
		//E.g. +972547334458, +972-547334458, +972-54-733-4458
		
		return null;
	}
}
