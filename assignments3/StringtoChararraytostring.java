package Assignment3;

public class StringtoChararraytostring {
	public static void main(String[] args) {
		
		char[] ch = { 'B', 'R', 'O', 'A', 'D', 'R', 'I', 'D', 'G', 'E' };
		String str = new String(ch);
		System.out.println(str);

		char c[] = str.toCharArray();

		System.out.println("On using toCharArray() method -");

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);

		}
	}
}