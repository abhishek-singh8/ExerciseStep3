package com.stackroute.p3;

public class ConsecutiveSevenDigitCheck {

	String consecutiveNumbercheck(String numberString) {
		String[] stringArray=numberString.split(",");
		if(stringArray.length!=7) {
			return "Count of numbers are not 7";
		}
		else {
			int[] arr=new int[7];
			int count=0;
			for(String s: stringArray) {
				try {
					int inputIntegerData=Integer.parseInt(s);
					arr[count]=inputIntegerData;
					count++;
				}
				catch(NumberFormatException ne) {
					return "Not a number";
				}
			}
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]!=arr[i+1]+1) {
					return "Not a consecutive number";
					
				}
			
			}
			return "Consecutive number";
		}
	}
	public static void main(String[] args) {
		ConsecutiveSevenDigitCheck pn=new ConsecutiveSevenDigitCheck();
		String numbers="75,74,73,72,71,70,78";
	    System.out.println(pn.consecutiveNumbercheck(numbers));
	}
}
