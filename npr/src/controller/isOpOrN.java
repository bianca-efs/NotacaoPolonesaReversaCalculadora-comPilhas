package controller;

public class isOpOrN {

	public static boolean isNumber(String s) {
	    try {
	        Double.parseDouble(s);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
	public static boolean isOperation(String s) {
	    if ((s.equals("+")) || (s.equals("-")) || (s.equals("/")) || (s.equals("*"))) {
	    	return true;
	    } else {return false;}
	}
}
