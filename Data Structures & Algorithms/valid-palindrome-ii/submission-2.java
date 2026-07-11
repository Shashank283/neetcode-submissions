class Solution {
     private boolean isPalindrome(String str,int s,int e){

        

        while(s<e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }

        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() -1;

        if(isPalindrome(s,l,r)){
            return true;
        }

        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return (isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1));
            }
            l++;
            r--;
        }
        return false;
        
    }
}