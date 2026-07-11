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
        int s1 =0; 
        int e = s.length() -1;

        if(isPalindrome(s,s1,e)){
            return true;
        }

        else{
            for(int i =0;i< s.length() ; i++){
                StringBuilder sb = new StringBuilder(s);
                sb.deleteCharAt(i);

                String result = sb.toString();

                if(isPalindrome(result,0,result.length()-1)){
                    return true;
                }
                else{
                    continue;
                }
                
            
        }
        return false;

        }

        
        
    }
}