package com.stackroute.p3;

public class PlaceNameVowel {

	public static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}
	String[] removeVowelFromPlaces(String[] places) {
		int count=0;
		String[] newStringArray=new String[places.length];
		for(String s: places) {
			String newString="";
		       if(isNumeric(s)) {
		    	   return null;
		       }
		       else {
		    	   char[] c=s.toCharArray();
		    	   for(int i=0;i<c.length;i++) {
		    		   if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
		    			   
		    		   }else {
		    			   newString=newString+c[i];
		    		   }
		    	   }
		       }
		       newStringArray[count]=newString;
		       count++;
		}
		return newStringArray;
	}
	public static void main(String[] args) {
		PlaceNameVowel pn=new PlaceNameVowel();
		String[] places={"India","United States","Germany","Egypt","Czechoslovakia"};
	    System.out.println(pn.removeVowelFromPlaces(places));
	}
}
