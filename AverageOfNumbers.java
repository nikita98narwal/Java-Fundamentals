package JavaFundamentals;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		float sum=0;
		float average = 0;
		float num;
		while(count<n) {
			num = sc.nextFloat();
			sum = sum+num;
			count++;
		}
			average = sum/count;
		System.out.println("Average of " +count+ " numbers is : " + average);
		
		int length = sc.nextInt();
		int arr[] = new int[length];
		for(int i = 0; i <length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < length; i++) {
			sum = sum+arr[i];
		}
		average = sum/arr.length;
		
		System.out.println("Average of numbers is : " + average);
		
		
		sc.close();
	}

}
