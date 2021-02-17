package JavaFundamentals;

import java.util.Scanner;

public class HollowDiamondpattern {
	public static void main(String[] args) {
		int i,j;
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		 i=1;
		while(i<=n){
		  j=i; 
		    while(j<=n){
		     System.out.print("*");
		     j++;
		  }
		j=1;
		  while(j<=(2*i-2)){
		     System.out.print(" ");
		     j++;
		  }
		  j=i; 
		  while(j<=n){
		     System.out.print("*");
		      j++;
		  }
		  System.out.print("\n");
		  i++;
		}
		  i=1;
		while(i<=n){
		  j=1;
		    while(j<=i){
		     System.out.print("*");
		     
		     j++;
		  }
		j=(2*i-2);
		  while( j<(2*n-2)){
		     System.out.print(" ");
		      j++;
		  }
		  j=1;
		  while(j<=i){
		     System.out.print("*");
		     j++;
		  }
		  System.out.print("\n");
		  i++;
		  }
		scan.close();
	}
}
