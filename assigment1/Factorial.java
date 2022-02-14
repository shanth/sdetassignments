package Assignment1;

public class Factorial {

	public static void main(String[] args) {
		int number = 5;
		long firstnumber = 1;
		int i = 1;
		while (i <= number) {
			firstnumber = firstnumber * i;
			i++;
		}
		System.out.println("Factorial of " + number + " is: " + firstnumber);
	}

}
