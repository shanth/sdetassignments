package Assignment2;

public class AvgNumUsingArray {
	
	public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5};
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }

        double average = total / arr.length;
       
        System.out.format("The average is: %.2f", average);
    }

}

