package com.stackroute.p3;

public class DifferentExceptionCheck {

	String negativeSizeArrayExceptionCase(int input) {
		try {
			int[] arr=new int[input];
			
		}catch(NegativeArraySizeException ex) {
		   return  ex.toString();
		}
		return "";
	}
	
	String arrayIndexOutOfBoundExceptionCase() {
		try {
			int[] arr=new int[] {6,8,9,2,18};
			arr[5]=8;
			
		}catch(ArrayIndexOutOfBoundsException ex) {
		   return  ex.toString();
		}
		return "";
	}
	
	String nullPointerExceptionCase() {
	
	        String ptr = null; 
	        try
	        {
	            if (ptr.equals("gfg"))
	                System.out.print("Same");
	            else
	                System.out.print("Not Same");
	        }
	        catch(NullPointerException e)
	        { return e.toString();
	        }
	        return "";
	    }
	public static void main(String[] args) {
		DifferentExceptionCheck d=new DifferentExceptionCheck();
		System.out.println(d.nullPointerExceptionCase());
		System.out.println(d.arrayIndexOutOfBoundExceptionCase());
		System.out.println(d.negativeSizeArrayExceptionCase(-1));
	}
	}

	

