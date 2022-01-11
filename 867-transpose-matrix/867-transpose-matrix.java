class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int M = matrix.length; int N = matrix[0].length;

	//result matrix (w/ size from transposition)
	int[][] B = new int[N][M];

	//iterate thru A
	for (int i = 0; i < M; i++) {
		for (int j = 0; j < N; j++) {
			//transpose
			B[j][i] = matrix[i][j];
		}
	}

	return B;
    }
}