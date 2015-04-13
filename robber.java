
/*you are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of
them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.*/

public int robber (int[] num){
	if(num == null || num.lenghth == 0){
		return 0;
	}
	
	int odd = 0;
	int even = 0;

	for(int i = 0; i < num.length; i++){
		if(i%2 == 0){
			even += num[i];
			if(even > odd){
				even = even;
			}
			else{
				even = odd;
		}
		else{
			odd += num[i];
			if(even > odd){
				odd = even;
			}
			else{
				odd = odd;
			}
		}
	if(even > odd){
		return even;
	}
	else{
		return odd;
	}
}
