package project;

public class zeroMatrix {
	public static void main(String args[]) {
		int[][] matrix = {{1,2,3},{4,0,5},{1,2,3}};
		setZero(matrix);
	}
	public static void setZero(int[][] matrix) {
		boolean[] row=new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
		
		for(int i=0;i<row.length;i++){
			for(int j=0;j<col.length;j++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i=0;i<row.length;i++) {
			if(row[i]) nullifyRow(matrix,i);
		}
		for(int j=0;j<col.length;j++) {
			if(row[j]) nullifycol(matrix,j);
		}
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void nullifyRow(int[][] matrix, int row) {
		for(int j=0;j<matrix[0].length;j++) {
			matrix[row][j] = 0;
		}
	}
	public static void nullifycol(int[][] matrix, int col) {
		for(int i=0;i<matrix[0].length;i++) {
			matrix[i][col] = 0;
		}
	}
	
}
