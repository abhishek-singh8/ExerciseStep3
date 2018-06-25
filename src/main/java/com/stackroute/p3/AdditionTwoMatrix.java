package com.stackroute.p3;

public class AdditionTwoMatrix {

	String sumMatrix(int row,int column,int[][] mat1,int[][] mat2) {
		
		int lengthRowMat1=mat1.length;
		int lengthRowMat2=mat2.length;
		int lengthColumnMat1=mat1[0].length;
		int lengthColumnMat2=mat2[0].length;
		int mat1Size=lengthRowMat1*lengthColumnMat1;
		int mat2Size=lengthRowMat2*lengthColumnMat2;


		int rowColumnDataSize=row*column;
		if(mat1Size!=rowColumnDataSize || mat2Size!=rowColumnDataSize) {
			return "Matrix given is not according to row column size given";
		}
		else {
			matrixAdditionOnly(3,2,mat1,mat2);
		}
		return "";
		
	}
    int[][] matrixAdditionOnly(int row,int column,int[][] mat1,int[][] mat2){

		int resultMatrix[][]=new int[row][column];
    	for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				resultMatrix[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(resultMatrix[i][j]);
			}
		}
    	return resultMatrix;
    }
	public static void main(String[] args) {
		int[][] mat1= {{1,2},{3,4},{5,6}};
		int[][] mat2= {{9,8},{7,6},{5,4}};
		AdditionTwoMatrix am=new AdditionTwoMatrix();
		System.out.println(am.sumMatrix(3, 2, mat1, mat2));
	}

	
}
