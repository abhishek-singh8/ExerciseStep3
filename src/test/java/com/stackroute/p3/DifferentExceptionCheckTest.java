package com.stackroute.p3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DifferentExceptionCheckTest {

	DifferentExceptionCheck exception;
	String number;
	
	@Before
	public void setup() {
        exception=new DifferentExceptionCheck();
	}
	@Test
	public void nullPointerExceptionCaseTest() {
		assertEquals(new String("java.lang.NullPointerException"),exception.nullPointerExceptionCase());
	}
	@Test
	public void arrayIndexOutOfBoundExceptionCaseTest() {
		assertEquals(new String("java.lang.ArrayIndexOutOfBoundsException: 5"),exception.arrayIndexOutOfBoundExceptionCase());
	}
	@Test
	public void negativeSizeArrayExceptionCaseTest() {
		assertEquals(new String("java.lang.NegativeArraySizeException"),exception.negativeSizeArrayExceptionCase(-2));
	}
    
}
