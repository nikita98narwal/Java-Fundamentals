package JavaFundamentals;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		double SI = principal*rate*time/100;
		System.out.println("Simple Interest : " + SI);
		sc.close();
		
	}

}
