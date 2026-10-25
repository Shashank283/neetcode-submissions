class Solution {
    public boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();

        for(int i = 0 ; i< s.length() ; i++){
            char c = s.charAt(i);
            if(c =='(' || c == '{' || c=='['){
                stk.push(c);
            }

            else{

                if(stk.isEmpty()) return false;

                if(c == ')'){
                    if(stk.peek() != '(') return false;
                    stk.pop();
                }
                
                else if(c == '}'){
                     if(stk.peek() != '{') return false;
                     stk.pop();
                }
                else{
                    if(stk.peek() != '[') return false;
                    stk.pop();
                }
                
            }
        }

        return stk.isEmpty();
        
    }
}
