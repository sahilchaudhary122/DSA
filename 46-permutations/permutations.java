class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        // Base case: if the path is the same length as nums, we found a permutation
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // element already used
            
            // Choose
            used[i] = true;
            tempList.add(nums[i]);
            
            // Explore
            backtrack(result, tempList, nums, used);
            
            // Un-choose (Backtrack)
            tempList.remove(tempList.size() - 1);
            used[i] = false;
        }
    }
}