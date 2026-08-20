class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }

        }
        return j+1;
        // int left=0;
        // int right=1;
        // while(right<nums.length){
        //     if(nums[left]==nums[right]){
        //         right++;
        //         continue;
        //     }
        //     left++;
        //     nums[left]=nums[right];
        //     right++;
        // }
        // return left+1;
        
    }
}