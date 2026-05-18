class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hm = new HashMap<>();

       int counter = 0;
       for(int i=0;i < nums.length;i++){
            counter = target - nums[i];
            if(hm.containsKey(counter)){
                return new int[]{hm.get(counter),i};
            }
            hm.put(nums[i],i);
       } 

        return new int[]{};
    }
}
