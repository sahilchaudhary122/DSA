class Solution {
    public boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left <= right){
            char lch=s.charAt(left);
            if(!Character.isLetterOrDigit(lch)){
                left++;
                continue;
            }

            char rch=s.charAt(right);
            if(!Character.isLetterOrDigit(rch)){
                right--;
                continue;
            }

            if(Character.toLowerCase(lch) != Character.toLowerCase(rch)){
                return false;
                
            }
            left++;
            right--;

        }
        return true;

    }
}