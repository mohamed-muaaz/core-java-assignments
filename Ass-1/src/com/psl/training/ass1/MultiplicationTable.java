package com.psl.training.ass1;

public class MultiplicationTable {
	static void displayMultiplicationMatrix() {
		int table[][] = new int[13][13];
		for (int i=1; i<=12; i++) {
			for(int j=1; j<=i; j++) {
				table[i][j] = i*j;
				table[j][i] = i*j;
			}
			table[0][i]=i;
			table[i][0]=i;
		}
		
		for(int[] row:table) {
			for(int col:row) {
				System.out.print(col+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMultiplicationMatrix();
	}

}
