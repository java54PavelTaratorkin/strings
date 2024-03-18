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
//		String regex = "[0-1]\\d{0,2}|2[0-4]\\d|25[0-5]";
		String regex = "[01]?\\d{1,2}\\d|2([0-4]\\d|5[0-5])";
		
		return regex;
	}
	
	public static String mobileIsraelPhone() {
		//string contains possible Israel mobile phone number
		//+972-(maybe without '-' but no space)<prefix two digit beginning from 5>-<7 digits of number>
		//<prefix three digits: first - 0, second 5, third - any>-(maybe without '-' but no space)<7 digits of number>
		//E.g. 054-733-44-58, 054-73344-58, 054-7334458, 054733-44-58, 0547334458
		//E.g. +972547334458, +972-547334458, +972-54-733-4458
		String regex = "[+]972-?5\\d-?\\d{3}-?\\d{4}"
				+ "|05\\d-?\\d{3}-?\\d{4}";
		
//		String regex = "(\\+972-?|0)5\\d-?(\\d{d3}-\\d{2}-|\\d{2}-?\\d{3}-?)\\d{2}";
		
		return regex;
	}
}
