package package5;

import java.util.Scanner;

public class Class5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This is code for Narcisstic Number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
	
         	int sum=0;
			int num1=num;
			int numOfDigits = String.valueOf(num).length();
			while(num1>0) {
				int digit = num1%10;
				sum+=Math.pow(digit,numOfDigits);
				num1=num1/10;
			}
			
			if (sum==num) {
			   System.out.println(num+ " is NarcissisticNumber");	
			}
			else {
				   System.out.println(num+ " is not NarcissisticNumber");	

			}

	}
	}
