package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Up to what number do you want to find primes?");
		int n = in.nextInt();
		boolean[] primeList = new boolean [n+1];

		for (int count = 2; count < primeList.length; count++) {
			primeList[count] = true;
		}

		for (int prime = 2; prime<primeList.length; prime++) {
			if (primeList[prime]==true) {
				for (int p = 2; p*prime < primeList.length; p++) {
					primeList[prime*p]=false;
				}
			}
		}
		for (int print = 2; print<primeList.length;print++) {
			if (primeList[print]==true) {
			System.out.println(print);
		}
			
				
		}
	}




}

