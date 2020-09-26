package main.java.recursion;

import java.util.Scanner;
 
/**
 * code for greatest common divisor using euclidean theorem
 * @author mohitjai
 *
 */
public class GCDUsingRecursion {
	
	public static int gcd(int a, int b){
		
		if(a==b){
			return a;
		}
		if(a % b == 0){
			return b;
		}
		if(b % a == 0){
			return a;
		}
		if(a > b){
			return gcd((a % b), b);
		}
		
		else{
			return gcd(a, (b % a));
		}
	}
	
	public static void main(String [] args){
		System.out.println("Please provide two values with a single gap between them");
		Scanner sc = new Scanner(System.in);
		String inputs = sc.nextLine();
		String [] values = inputs.split(" ");
		Integer value1 = Integer.parseInt(values[0]);
		Integer value2 = Integer.parseInt(values[1]);
		int gcd = GCDUsingRecursion.gcd(value1, value2);
		System.out.println(gcd);
		
	}

}
