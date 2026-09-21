class Solution {
    public int lengthOfLongestSubstring(String s) {
    //    HashSet<Character> set=new HashSet<>();
    //    char[] arr = s.toCharArray();
    //    int left=0,maxLength=0;
    //    for(int i=0;i<arr.length;i++){
    //     while(set.contains(arr[i])){
    //         set.remove(arr[left]);
    //         left++;
    //     }
    //     set.add(arr[i]);
    //     maxLength=Math.max(maxLength,i-left+1);
    //    }
    //    return maxLength;

    HashSet<Character> set=new HashSet<>();
    int left=0;
    int max=0;
    for(int i=0;i<s.length();i++){
        while(set.contains(s.charAt(i))){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(i));
        max=Math.max(max,i-left+1);
    }
      return max;
    }
}