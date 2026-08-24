class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int answer=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                sum += -1;
            else
                sum += 1;

            if(map.containsKey(sum)){
                int length = i-map.get(sum);
                answer=Math.max(answer,length);
            }
            else
                map.put(sum,i);
        }
        return answer;
    }
}