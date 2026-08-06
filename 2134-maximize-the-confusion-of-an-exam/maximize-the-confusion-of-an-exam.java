class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int[] freq= new int[2];
        int l=0;
        int windows=0;
        int result =0;
        int max=0;
        for(int r=0;r<answerKey.length();r++){
            int rightindex=( answerKey.charAt(r) == 'T') ?0:1;
            freq[rightindex]++;
            max=Math.max(max,freq[rightindex]);
            windows=r-l+1;
            
            while( windows - max > k){
                int leftindex=( answerKey.charAt(l) == 'T') ?0:1;
                freq[leftindex]--;
                l++;
                windows = r-l+1;
            }

            result=Math.max(result,windows);
        }
        return result;
    }
}