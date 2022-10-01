package dublicate_element_array;

public class Example{
	public static void main(String[] args) {
		String h = "priyanka";
		
		for(int i=0; i<h.length(); i++) {
			for(int j=i+1; j<h.length(); j++) {
				if(h.charAt(i) == h.charAt(j)) {
					System.out.println(h.charAt(i));
				}
			}
		}
	}
			
}
