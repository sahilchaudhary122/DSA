class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        // List<Integer> path=new ArrayList<>();
        // boolean[] used=new boolean[nums.length];

        //backtrack(nums,used,path,result);
        // return result;

        backtrack(nums,0,result);
        return result;

    }
    /*
    private void backtrack(int[] nums,boolean[] used,List<Integer> path,List<List<Integer>> result){
        if(path.size()==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==true){
                continue;
            }
            path.add(nums[i]);
            used[i]=true;

            backtrack(nums,used,path,result);

            used[i]=false;
            path.remove(path.size()-1);
        }
        */
        private void backtrack(int[] nums,int index,List<List<Integer>> result){
        if(index==nums.length){
            List<Integer> perm=new ArrayList<>();
            for(int num:nums){
                perm.add(num);
            } 
            result.add(new ArrayList<>(perm));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);

            backtrack(nums,index+1,result);

            swap(nums,index,i);
        }
    }
    private void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}