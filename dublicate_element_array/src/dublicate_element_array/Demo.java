package dublicate_element_array;
//find the duplicate element of String
public class Demo {
	public static void main(String[] args) {
		String s3 = "dipika";
		
		for(int i=0; i<s3.length(); i++) {
			for(int j=i+1; j<s3.length(); j++) {
				if(s3.charAt(i) == s3.charAt(j)) {
					System.out.println(s3.charAt(i));
				}
			}
		}
	}
}
