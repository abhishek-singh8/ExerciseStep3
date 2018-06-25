package com.stackroute.p3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChessBoardProblemTest {


	ChessBoardProblem chessBoard;
	
	
	@Before
	public void setup() {
//		 mat1= new int[][]{{1,2},{3,4},{5,6}};
//		 mat2= new int[][]{{9,8},{7,6},{5,4}};
		chessBoard=new ChessBoardProblem();
	}

	@Test
	public void chessBoardSizeCheckTest() {
		assertEquals(new String("Chess board pattern can't be achieved"),chessBoard.chessBoardSizeCheck(8, 9));
	}
	@Test
	public void chessBoardArrayCheck() {
		String[][] chessBoardExpected= {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
				                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
				                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
				                        {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				                        {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
		assertArrayEquals(chessBoardExpected,chessBoard.chessBoardArrayCheck(8, 8));
				                        
		}
	}

