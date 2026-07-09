class Solution {
    public int[] getConcatenation(int[] nums) {
            int []ans = new int[nums.length * 2];

            int inNums = 0;
            int i = 0;

            while(i < ans.length){
                if(inNums == nums.length){
                    inNums = 0;
                }
                ans[i] = nums[inNums];
                i++;
                inNums++;
            }

            return ans;
    }
}