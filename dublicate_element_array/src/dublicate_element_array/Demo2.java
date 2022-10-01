package dublicate_element_array;

public class Demo2 {
	public static void main(String[] args) {
		 String S1 = "strings";
	        
	     for(int i=0; i<S1.length(); i++) {
	    	 for(int j=i+1; j<S1.length(); j++) {
	    		 if(S1.charAt(i) == S1.charAt(j)) {
	    			 System.out.println(S1.charAt(i));
	    		 }
	    	 }
	     }
	}
}
