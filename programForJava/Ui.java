package programForJava;

import java.util.Scanner;

public class Ui {

	public static void main(String args[]) {
		int count;
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 2, 3,3, 4 };

		for (int i = 0; i < arr.length; i++) {
			count=0;
			for (int j = i+1; j < arr.length; j++) 
				 { 
				 if(arr[i]==arr[j]) 
				 {
				count++;
				
				 }
					
					}	

			if (count > 0) {
				System.out.println("duplicate: " + arr[i]);
			}
			
		
			}
			

		}

	}

