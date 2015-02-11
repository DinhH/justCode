//Given an array of integers, every element appears twice except for one. 
//Find that single one.

pulbic class singleNum{
	public int singleNumber(int[] A) {
		int ret = 0;
		int i;
		for (i = 0; i < A.length; i++) {
			ret = ret^A[i];
		}
		return ret;
	}
}

