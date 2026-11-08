package com.String;

public class Snippet {
	int max = 0;
	        int second = 0;
	
	        char firstChar = ' ';
	        char secondChar = ' ';
	
	        for(int i = 0; i < str.length(); i++) {
	
	            int count = 0;
	
	            for(int j = 0; j < str.length(); j++) {
	
	                if(str.charAt(i) == str.charAt(j)) {
	                    count++;
	                }
	            }
	
	            if(count > max) {
	
	                second = max;
	                secondChar = firstChar;
	
	                max = count;
	                firstChar = str.charAt(i);
	
	            }
	            else if(count > second && count < max) {
	
	                second = count;
	                secondChar = str.charAt(i);
	            }
	        }
	
	        System.out.println(secondChar + " (frequency: " + second + ")");
}

