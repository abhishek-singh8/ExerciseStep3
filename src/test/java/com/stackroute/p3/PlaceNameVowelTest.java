package com.stackroute.p3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlaceNameVowelTest {

	PlaceNameVowel placeNameVowel;
	String[] places;
	
	
	@Before
	public void setup() {
	   	 places=new String[]{"India","United States","Germany","Egypt","Czechoslovakia"};
		 placeNameVowel=new PlaceNameVowel();
	}
     
	@Test
	public void placesNameCheckTest() {
		String[] places={"India","129","Germany","Egypt","Czechoslovakia"};
		assertNull(placeNameVowel.removeVowelFromPlaces(places));
	}
	@Test
	public void removedVowelTest() {
		String[] expectedRemovedVowel= {"Ind","Untd Stts","Grmny","Egypt","Czchslvk"};
		assertArrayEquals(expectedRemovedVowel,placeNameVowel.removeVowelFromPlaces(places));
	}
}
