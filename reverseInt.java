//Reverse digits of an integer.

//Example1: x = 123, return 321
//Example2: x = -123, return -321

public int reverseInt(int num){
	boolean fg = false;
	if(num < 0 ){
		num = 0 - num;
		fg = true;
	}
	int res = 0;
	int newNum = num;
	
	while (newNum > 0){
		int mod = newNum % 10;
		newNum = newNum/10;
		res = res * 10 + mod;
	}
	if(fg){
		res = 0 - res;
	}
	
	return res;
}

