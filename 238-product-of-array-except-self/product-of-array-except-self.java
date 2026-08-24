class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftProduct=1;
        int rightProduct=1;
        int[] answer=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            answer[i]=leftProduct;
            leftProduct *= nums[i];  
        }
        for(int i=nums.length-1;i>=0;i--){
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return answer;
    }
}