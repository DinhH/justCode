//Divide two integers without using multiplication, division and mod operator.

//If it is overflow, return MAX_INT.

public int divide(int dividend, int divisor){
		int ret = 0;
		
		while(devidend >= divisor){
			int counter = 0;
			while(devidend >= (divisor << counter)){
				counter++;
			}
			ret += 1 << (counter -1);
			dividend -= << (counter -1);
		}
		if (dividend == Integer.MIN_VALUE && divisor == -1){
			//return the larger of the two
			return Integer.MAX_VALUE;
		}
		else if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)){
			return ret;
		}
		else
			return -ret;
}

			
