package dublicate_element_array;

public class Demo1 {
	public static void main(String[] args) {
		String g1 = "cricketer";
		
		for(int i=0; i<g1.length(); i++) {
			for(int j=i+1; j<g1.length(); j++) {
				if(g1.charAt(i) == g1.charAt(j)) {
					System.out.println(g1.charAt(i));
				}
			}
		}
	}
}
