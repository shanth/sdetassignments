package Assignment3;

public class FindWordinstring {
	public static void main(String[] args) {
		String strOrig = "A brown fox ran away fast";
		int intIndex = strOrig.indexOf("brown");
		if(intIndex == - 1) {
			System.out.println("brown not found");
		} else {
			System.out.println("Found brown at index "+ intIndex);
		}
	}
}