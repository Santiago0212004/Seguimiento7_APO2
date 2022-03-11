package main;

import java.util.Scanner;

public class HelpfulMaths {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sum = sc.next();

		
		String[] arraySum = sum.split("\\+");
		
		boolean different = false;
		
		for(String s : arraySum) {
			if(!s.equalsIgnoreCase("1") && !s.equalsIgnoreCase("2") && !s.equalsIgnoreCase("3")) {
				different = true;
			}
		}
		
		if(sum.length()<=100 && !different) {
			int a, b;
			for(int i=0; i<(arraySum.length-1); i++) {
				for(int j=(i+1); j<arraySum.length ; j++) {
					a = Integer.parseInt(arraySum[i]);
					b = Integer.parseInt(arraySum[j]);
					
					if(a>b) {
						arraySum[i] = b+"";
						arraySum[j] = a+"";
					}
				}
			}
			
			String orderedSum = "";
			

			for(int i=0; i<arraySum.length; i++) {

				orderedSum += arraySum[i]+"+";
			
			}
			
			orderedSum = orderedSum.substring(0,orderedSum.length()-1);
			
			System.out.println(orderedSum);
		}
			
	}

}