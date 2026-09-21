class Solution {
    public boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;
        // while(left <= right){
        //     char lch=s.charAt(left);
        //     if(!Character.isLetterOrDigit(lch)){
        //         left++;
        //         continue;
        //     }

        //     char rch=s.charAt(right);
        //     if(!Character.isLetterOrDigit(rch)){
        //         right--;
        //         continue;
        //     }

        //     if(Character.toLowerCase(lch) != Character.toLowerCase(rch)){
        //         return false;
                
        //     }
        //     left++;
        //     right--;

        // }

        while(left < right){
            char lch=s.charAt(left);
            char rch=s.charAt(right);
            if(!((lch>='a' && lch<='z') || (lch>='A' && lch<='Z') || (lch>='0' && lch<='9'))){
                left++;
                continue;
            }
            if(!((rch>='a' && rch<='z') || (rch>='A' && rch<='Z') || (rch>='0' && rch<='9'))){
                right--;
                continue;
            }
            if( Character.toLowerCase(lch) != Character.toLowerCase(rch)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}