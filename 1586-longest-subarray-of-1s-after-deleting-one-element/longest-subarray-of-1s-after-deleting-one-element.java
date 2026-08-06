class Solution {
    public int longestSubarray(int[] nums) {
        int noZero=0;
        int l=0;
        int result=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]== 0)
                noZero++;

            while(noZero > 1){

                if(nums[l] == 0)
                    noZero--;

                l++;

            }
            result=Math.max(result,i-l);
        }
        return result;
    }
}