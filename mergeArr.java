public void merge(int A[], int i, int B[], int j){
	while(i > 0 && j > 0) {
		if (A[i-1] > B[j-1]){
			A[i+j-1] = A[i-1];
			i--;
		}
		else{
			A[i+j-1] = B[j-1];
			j--;
		}
	}
	while(j > 0){
		A[i+j-1] = B[j-1];
		j--;
	}
}

