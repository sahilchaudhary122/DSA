class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,0,result,path);
        return result;
    }
    private void subset(int[] nums, int i , List<List<Integer>> result, List<Integer> path){
        if(i>=nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        path.add(nums[i]);
        subset(nums,i+1,result,path);

        path.remove(path.size()-1);

        while(i+1<nums.length && nums[i+1]== nums[i]){
            i++;
        }
        subset(nums,i+1,result,path);
    }
}