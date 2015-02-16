//All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T,
//for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

//Write a function to find all the 10-letter-long sequences (substrings) that
// occur more than once in a DNA molecule.

public class Solution {  
   public List<String> findRepeatedDnaSequences(String s) {  
     List<String> result=new ArrayList<String>();  
     HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	for(int i = 0; i < = s.length() - 10 ; i++) {
		String sub = s.substring(i, i+10);
		int newKey = getKey(sub);
		if(map.containskey(newKey)){
			map.put(newKey,map.get(newKey)+1)  
     			if(map.get(newKey) == 2){
				result.add(sub);
			}
		}
		else
			map.put(key,1);
	}
	return result;
	}

	public int gerKey(String S){
		int result = 0;
		for(int i = s.length()-1; i >= 0; i--) {
			int match = 0;
	j		switch(s.charAt(i)) {
				case 'A':
					b |= 0;
					break;
				case 'T':
					b |= 1;
					break;
				case 'G':
					b |= 2;
					break;
				case 'C':
					b |= 3;
					break;
			}
			result = b | result;
			result = result << 2;
		}
		return result;
	}
}
				
	
	
     return result;  
   }  
 }  

