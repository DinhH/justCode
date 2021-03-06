
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        Stack<Character> stack = new Stack<Character>();
        
        int i;
        for(i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            
            if(map.keySet().contains(cur)){
                stack.push(cur);
            }
            else if(map.values().contains(cur)){
                if(!stack.empty() && map.get(stack.peek()) == cur){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
    return stack.empty();
}
