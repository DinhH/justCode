//Write a  function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

//For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.


public int bitCount(unit32_t n){
	int ret = 0;
	while(n != 0){
	//using AND logic gate to get rid of the 1's until n is 0
		n = n&(n-1);
		ret++;
	}
	return ret;
}
