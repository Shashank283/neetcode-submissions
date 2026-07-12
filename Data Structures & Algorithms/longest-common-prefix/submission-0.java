class Solution {
    public String longestCommonPrefix(String[] strs) {

        int minLen = strs[0].length();
        StringBuilder ans = new StringBuilder();
        for(String str : strs){
            minLen = Math.min(minLen,str.length());
        }

        for(int i = 0; i<minLen; i++){
            char ch = strs[0].charAt(i);

            for(int j = 1; j< strs.length ; j++){
                if(strs[j].charAt(i) != ch){
                    return ans.toString();
                }
            }

            ans.append(ch);
        }

        return ans.toString();

        
    }
}