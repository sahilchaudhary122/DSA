class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=left(nums,target);
        result[1]=right(nums,target);
        return result;
    }
    int left(int[] nums,int target){
        int index=-1;
        int left=0;
        int right=nums.length-1;
        while(left<= right){
            int mid= left +(right-left)/2;
            if(nums[mid]==target){
                index=mid;
                right = mid-1;
            }
            else if(nums[mid]<target){
                left= mid +1;
            }
            else{
                right=mid - 1;
            }

        }
        return index;
    }
    int right(int[] nums,int target){
        int index=-1;
        int left=0;
        int right=nums.length-1;
        while(left<= right){
            int mid= left +(right-left)/2;
            if(nums[mid]==target){
                index=mid;
                left= mid +1;
            }
            else if(nums[mid]<target){
                left = mid +1;
            }
            else{
                right=mid - 1;
            }

        }
        return index;
    }
}