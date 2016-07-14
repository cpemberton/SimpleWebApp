package com.develogical.app;

public class QueryProcessor {

    public String process(String query) {
    	
    	if (query.contains("what") && query.contains("multiplied")  ) {
    		double product = 1; 
    		for (int i = 0; i<query.split(" ").length; i++) {
    			if (isNumeric(query.split(" ")[i])) {
    				product = product * Double.parseDouble(query.split(" ")[i]);
    			}
    		}
    		return Double.toString(product); 
    	}
    	
    	if (query.contains("what") && query.contains("plus")  ) {
    		double sum = 0; 
    		for (int i = 0; i<query.split(" ").length; i++) {
    			if (isNumeric(query.split(" ")[i])) {
    				sum = sum + Double.parseDouble(query.split(" ")[i]);
    			}
    		}
    		return Double.toString(sum); 
    	}	
    	
        return "";
    }
    
    public static boolean isNumeric(String str)
    {
      return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}
