package com.develogical.app;

public class QueryProcessor {

    public String process(String query) {
    	// multiplied 
    	if (query.contains("what") && query.contains("multiplied")  ) {
    		double product = 1; 
    		for (int i = 0; i<query.split(" ").length; i++) {
    			if (isNumeric(query.split(" ")[i])) {
    				product = product * Double.parseDouble(query.split(" ")[i]);
    			}
    		}
    		return Double.toString(product); 
    	}
    	// plus 
    	if (query.contains("what") && query.contains("plus")  ) {
    		double sum = 0; 
    		for (int i = 0; i<query.split(" ").length; i++) {
    			if (isNumeric(query.split(" ")[i])) {
    				sum = sum + Double.parseDouble(query.split(" ")[i]);
    			}
    		}
    		return Double.toString(sum); 
    	}	
    	// largest 
    	if (query.contains("which") && query.contains("largest")  ) {
    		double max = 0; 
    		for (int i = 0; i<query.split(" ").length; i++) {
    			if (isNumeric(query.split(" ")[i])) {
    				max = (Double.parseDouble(query.split(" ")[i]) > max)? Double.parseDouble(query.split(" ")[i]): max; 
    			}
    		}	
    		return Double.toString(max); 
    	}
    		
    	
    	// square and a cube 
    	if (query.contains("which") && query.contains("square")  ) {
    		double res = 0; 
    		for (int i = 0; i<query.split(" ").length; i++) {
    			if (isNumeric(query.split(" ")[i])) {
    				double squarer = Math.sqrt(Double.parseDouble(query.split(" ")[i])); 
    				double cuber = Math.cbrt(Double.parseDouble(query.split(" ")[i])); 
    				if ((squarer == (int)squarer) && (cuber == (int)cuber)) {
    					res = Double.parseDouble(query.split(" ")[i]);
    				}
    			}
    		}
    		return Double.toString(res); 
    	}	
    	
        return "";
    }
    
    
    
    public static boolean isNumeric(String str)
    {
      return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
    
    
}
