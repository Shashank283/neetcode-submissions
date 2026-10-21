class Solution {

     List<String> ans = new ArrayList<>();

    void solve(int num, String prev, String digits, char[][] keypad){
        if(prev.length() == digits.length()) {

            ans.add(prev);
            return;

        }

        int currNum = keypad[digits.charAt(num)- '0'].length;

        for(int i = 0; i< currNum ;i++){
            solve(num+1, prev + keypad[digits.charAt(num)- '0'][i],digits,keypad);
        }
    }

    public List<String> letterCombinations(String digits) {

        char[][] keypad = {{'0'},{'0','0'},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        int n = digits.length();
        if(n ==0) return Collections.emptyList();

        solve(0,"",digits,keypad);

        return ans;

        
    }
}
