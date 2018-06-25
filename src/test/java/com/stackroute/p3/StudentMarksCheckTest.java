package com.stackroute.p3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class StudentMarksCheckTest {

	StudentMarksCheck student;
		int[] arr;
		
		@Before
		public void setup() {
			arr=new int[] {89,78,76,85};
		    student=new StudentMarksCheck();
		}
	    @Test
	    public void validSizeInputTest() {
	    	
	    	assertEquals(new String("Please enter some number as input"),student.gradeTest("asbx", arr));
	    }
	    @Test
	    public void emptySizeInputTest() {
	    	int[] arr=new int[] {};
	    	assertNull(student.gradeTest("0", arr));
	    }
	    @Test
	    public void inputRangeCheck() {
	    	int[] arr=new int[] {230,89,83,920};
	    	assertEquals(new String("Please enter a valid input in range"),student.gradeTest("4", arr));
	    }
}
