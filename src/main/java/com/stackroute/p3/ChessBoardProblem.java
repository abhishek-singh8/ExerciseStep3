package com.stackroute.p3;

public class ChessBoardProblem {

	public String chessBoardSizeCheck(int row,int column) {
		if(row!=column) {
			return "Chess board pattern can't be achieved";
		}else {
			chessBoardArrayCheck(row,column);
			return "";
		}
	}
	public String[][] chessBoardArrayCheck(int row,int column) {
	String[][] chessBoard=new String[8][8];
	String white = "WW|";
	String black = "BB|";
	
	for(int i=0;i<8;i++) {
		for(int j=0;j<8;j++) {
			if(i%2==0) {
				if(j%2==0) {
					chessBoard[i][j]=white;
				}
				else {
					chessBoard[i][j]=black;
				}
			}
			else {
				if(j%2==0) {
					chessBoard[i][j]=black;
				}
				else {
					chessBoard[i][j]=white;
				}
			}
		}
	}
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					System.out.print(chessBoard[i][j]);
				}
				System.out.println();
			}
	return chessBoard;
	}
}
