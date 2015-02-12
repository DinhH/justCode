//Given an array of integers, every element appears twice except for one. 
//Find that single one.

class singleNum{
	public void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,1,2,3,4,5,6,7};

		singleNum(num);
	}

	public int singleNum(int [] A){
		int ret = 0;
		int i;
		for (i = 0; i < A.length; i++) {
			ret = ret^A[i];
		}
		return ret;
	}
}

