//updated the Java version
//will work on C now.

class Reverse{

	public void main(String[] args){
		 Reverse obj = new Reverse();
		 System.out.println(obj.reverseStr("hello world"));
         System.out.println(obj.reverseStr("mihir"));
	}
	
	public String reverseStr( String str){
		char[] chars = str.toCharArray();
		for(int i = 0, j = str.length() - 1; i < j; i++, j--){
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		return new String(chars);
	}
}
