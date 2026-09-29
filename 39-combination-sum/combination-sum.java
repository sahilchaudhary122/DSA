class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> comb = new ArrayList<>();

        backtrack(candidates , 0, target , result, comb);
        return result;
    }
    private void backtrack(int[] candidates,int i, int target,List<List<Integer>> result,List<Integer> comb){
        if(target==0){
            result.add(new ArrayList<>(comb));
            return;
        }
        if(i==candidates.length || target<0 ){
            return;
        }
        comb.add(candidates[i]);
        //backtrack(candidates, i+1,target-candidates[i], result,comb);
        backtrack(candidates, i,target-candidates[i], result,comb);

        comb.remove(comb.size()-1);
        backtrack(candidates, i+1,target, result,comb);

    }
}