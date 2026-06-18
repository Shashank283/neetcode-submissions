class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      int ans = Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap();
        for (int i =0; i< nums.length;i++){
            if(map.containsKey(nums[i])){
                ans = i - map.get(nums[i]);
                map.put(nums[i],i);

                
            }
            else{
                map.put(nums[i],i);
            }
            
        }
        return ans <= k;

    }
}