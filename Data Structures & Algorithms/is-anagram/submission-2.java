class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();

        HashMap<Character,Integer> hmap = new HashMap<>();

        for(int i =0;i<n;i++){

            if(hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
            }
            else{
                hmap.put(s.charAt(i),1);

            }

            
        }

        for(int i = 0 ; i< t.length() ;i++){

            if(!hmap.containsKey(t.charAt(i)) || hmap.get(t.charAt(i))==0 || s.length() != t.length()){
                return false;
            }
            else{
                hmap.put(t.charAt(i),hmap.get(t.charAt(i))-1);
            }

        }
        return true;

    }
}
