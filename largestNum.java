//Given a list of non negative integers, arrange them such that they form the largest number.

//For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

//Note: The result may be very large, so you need to return a string instead of an integer.

public String largestNum(int[] num){
	String[] ret = new String[num.length];
	int i;
	for(i = 0; i <num.length; i++){
		ret[i] = String.valueOf(num[i]);
	}
	java.util.Arrays.sort(ret, new java.util.Comparator,String>() {
		public int compare(String right, left){
			String rL = right.concat(right);
			String lR = left.concat(left);
			return rl.compareTo(lR);
		}
	});
	//trying to append the number together after comparasion
	StringBuilder newString = new StringBuilder();
	int i;
	for (i = 0; i < ret.length; i++){
		newString.append(ret[i]);
	}
	
	//picking the larger of the options
	//LeetCode suggested using BigInteger
	java.math.BigInteger ret1 = new java.math.BigInteger(newString.toString());
	return ret1.toString();
}

	
