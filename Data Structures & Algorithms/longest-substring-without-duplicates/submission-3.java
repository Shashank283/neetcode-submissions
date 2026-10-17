class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        int maxLen = 0;

       

        HashSet<Character> hs = new HashSet<>();
        int i =0;
        if(n == 0) maxLen = 0;

        for(int j = 0; j< n ;j++){          
            while(hs.contains(s.charAt(j))){
                int len = hs.size();
                maxLen = Math.max(maxLen,len);
                hs.remove(s.charAt(i));
                i++;       
            }

        hs.add(s.charAt(j));
        int len = hs.size();
        maxLen = Math.max(maxLen,len);
        }
        return maxLen;
        
    }
}
