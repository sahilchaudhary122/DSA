class Solution {
    public int maxArea(int[] height) {
    //    int left=0,right=height.length-1;
    //    int water;
    //    int max=0;  
    //    while(left<right){
    //         water=Math.min(height[left],height[right])*(right-left);
    //         if(height[left]<height[right])
    //             left++;
    //         else
    //             right--;
    //         max=Math.max(max,water);
    //    } 
    //    return max;
    
    int left=0,right=height.length-1;
    int maxArea=0;
    while(left < right){
        int width=right - left;
        int currheight=Math.min(height[left],height[right]);
        int area = width * currheight;
        maxArea=Math.max(maxArea,area);
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
    }
        return maxArea;
    }
}