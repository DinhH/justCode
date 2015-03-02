
public int singleNum(int[] A){
	int ret = 0;
	int i;
	for (i = 0; i < A.length; i++){
		ret = ret ^ A[i];
	}
	return ret;
}

