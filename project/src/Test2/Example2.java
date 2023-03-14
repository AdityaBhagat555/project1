package Test2;

public class Example2 {

	    public static void main(String[] args) {
	        String str = "  I Love India   ";
	        String result = removeLeadingTrailingSpaces(str);
	        System.out.println(result); 
	    }
	    
	    public static String removeLeadingTrailingSpaces(String str) {
	        int start = 0;
	        int end = str.length() - 1;
	        
	        // remove leading spaces
	        while (start < str.length() && str.charAt(start) == ' ') {
	            start++;
	        }
	        
	        while (end >= 0 && str.charAt(end) == ' ') {
	            end--;
	        }
	        
	        String result = "";
	        for (int i = start; i <= end; i++) {
	            result += str.charAt(i);
	        }
	        return result;
	    }
	}

	    
	    


