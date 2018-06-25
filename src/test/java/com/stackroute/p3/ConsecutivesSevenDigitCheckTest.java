package com.stackroute.p3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConsecutivesSevenDigitCheckTest {


	ConsecutiveSevenDigitCheck csd;
		String number;
		
		@Before
		public void setup() {
			number="77,76,75,74,73,72,71";
            csd=new ConsecutiveSevenDigitCheck();
		}
      @Test
      public void sevenDigitCheck() {
    	  assertEquals("Count of numbers are not 7",csd.consecutiveNumbercheck("77,76,75,74,73,72,71,70"));
      }
      @Test
      public void notANumbercheck() {
    	  assertEquals("Not a number",csd.consecutiveNumbercheck("77,raj,75,74,73,72,askjd"));

      }
      @Test
      public void consecutiveNumberCheck() {
    	  assertEquals("Not a consecutive number",csd.consecutiveNumbercheck("77,72,75,74,73,72,71"));
 
      }
      @Test
      public void notConsecutiveNumberCheck() {
    	  assertEquals("Consecutive number",csd.consecutiveNumbercheck("77,76,75,74,73,72,71"));
 
      }
}
