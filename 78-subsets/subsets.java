import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> path=new ArrayList<>();

        backtracking(nums,0,path,result);
        return result;
    }
    private void backtracking(int[] nums,int index,List<Integer> path,List<List<Integer>> result){
        result.add(new ArrayList<>(path));
        for(int i=index;i<nums.length;i++){
            path.add(nums[i]);
            backtracking(nums,i+1,path,result);
            path.remove(path.size()-1);

        }
    }
}