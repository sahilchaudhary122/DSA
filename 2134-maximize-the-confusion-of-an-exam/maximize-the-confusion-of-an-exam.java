class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int[] freq= new int[26];
        int l=0;
        int windows=0;
        int result =0;
        int max=0;
        for(int r=0;r<answerKey.length();r++){
            freq[answerKey.charAt(r) - 'F']++;
            max=Math.max(max,freq[answerKey.charAt(r) - 'F']);
            windows=r-l+1;
            while(windows - max > k){
                freq[answerKey.charAt(l)-'F'] --;
                l++;
                windows = r-l+1;
            }
            result=Math.max(result, windows);
        }
        return result;
    }
}