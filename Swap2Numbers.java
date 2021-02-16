package JavaFundamentals;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Value of A :" + a );
		System.out.println("Value of B :" + b );
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("Value of X :" + x );
		System.out.println("Value of Y :" + y );

		sc.close();
	}

}
