class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i < s.length() && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i < s.length() && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(i < s.length() && s.charAt(i)=='+'){
            i++;
        }
        int result=0;
        while(i<s.length() && (s.charAt(i)>='0' &&  s.charAt(i)<='9')){
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && (s.charAt(i) - '0') > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result =result*10 + (s.charAt(i) - '0');
            i++;
        }
        return result * sign;
       
    }
}