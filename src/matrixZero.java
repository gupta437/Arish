package project;

public class matrixZero {
	public static void main(String[] args){
		int[][] a = {{1,2,3},{1,0,1},{1,2,3}};
		a = matrix(a);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] matrix(int[][]matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] cols = new boolean[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					cols[j] = true;
				}
			}
		}
		
		for(int i=0;i<matrix.length;i++) {
			if(row[i] == true) {
				for(int j=0;j<matrix[0].length;j++) {
					matrix[i][j] = 0;
				}
			}
		}
		for(int i=0;i<matrix[0].length;i++) {
			if(cols[i] == true) {
				for(int j=0;j<matrix.length;j++) {
					matrix[j][i] = 0;
				}
			}
		}
		return matrix;
	}
}
