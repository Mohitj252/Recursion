package main.java.recursion;

import java.util.Scanner;
/**
 * Print the sum of FibonacciSeries, as well as print the fibonacciSeries.
 * Input - Provide the input for sequence (it is a int value)
 * @author mohitjai
 *
 */
public class FibonacciSeries {
	
	public static int fib(int i){
		
		if(i == 0){
			return 0;
		}
		if(i == 1){
			return 1;
		}
		else{
			return (fib(i - 1) + fib(i -2));
		}
	}
	
	public static void main(String [] args){
		System.out.println("specify a last index for fibonacci series");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int indexResult;
		for(int i = 0; i < input; i++){
			indexResult = FibonacciSeries.fib(i);
			System.out.print(indexResult);
			if(i<input-1)
				System.out.print(",");
		}
	}

}
