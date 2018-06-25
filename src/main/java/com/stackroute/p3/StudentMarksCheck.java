package com.stackroute.p3;
public class StudentMarksCheck {

	    public String gradeTest(String size,int[] arr)  {
	    	
	    	int arrSize;
	    	
	    	try {
	    		arrSize=Integer.parseInt(size);
	    		if(arrSize==0) {
		    		return null;
		    	}
	    	}
	    	catch(NumberFormatException ne) {
	    		return "Please enter some number as input";
	    	}
	   
	    	for(int i=0;i<arrSize;i++) {
	    		if(arr[i]>=0 && arr[i]<=100) {
	    			
	    		}
	    		else {
	    			return "Please enter a valid input in range";
	    		}
	    	}
	    	return null;
}
}
