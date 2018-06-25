package com.stackroute.p3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdditionTwoMatrixTest {

	AdditionTwoMatrix add;
	int[][] mat1;
	int[][] mat2;
	
	@Before
	public void setup() {
		 mat1= new int[][]{{1,2},{3,4},{5,6}};
		 mat2= new int[][]{{9,8},{7,6},{5,4}};
		 add=new AdditionTwoMatrix();
	}
	@Test
	public void inputSizeMatrixCheck() {
		int[][] mat1={{1,2,5},{3,4},{5,6}};
		int[][] mat2={{1,2},{3,4},{5,6},{2,4}};
		String actualString=add.sumMatrix(3, 2,mat1, mat2);
		assertEquals("Matrix given is not according to row column size given",actualString);
	}
	@Test
	public void additionTest() {
		int[][] expectedMatrix={{10,10},{10,10},{10,10}};
		
		assertArrayEquals(expectedMatrix,add.matrixAdditionOnly(3, 2, mat1, mat2));
	}
}
