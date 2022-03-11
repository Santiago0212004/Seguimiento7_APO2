package main;

import java.util.Scanner;

public class SpykeTalks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		
		for(int i=0; i<n; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int a,b;
		for(int i=0; i<(numbers.length-1); i++) {
			for(int j=(i+1); j<numbers.length ; j++) {
				a = numbers[i];
				b = numbers[j];
				
				if(a>b) {
					numbers[i] = b;
					numbers[j] = a;
				}
			}
		}
		
		int count = 0;
		
		boolean error = false;
		for(int i=0; i<numbers.length-1 && !error; i++) {
			if(numbers[i]!=0) {
				if(i!=numbers.length-2) {
					if(numbers[i]==numbers[i+1] && numbers[i]==numbers[i+2]) {
						count = -1;
						error = true;
					}
					else if(numbers[i]==numbers[i+1]) {
						count++;
						i++;
					}
				}
				else if(numbers[i]==numbers[i+1]) {
					count++;
					i++;
				}
			}
		}
		
		System.out.println(count);
		
	}
}
	
