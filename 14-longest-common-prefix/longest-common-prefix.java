class Solution {
    public String longestCommonPrefix(String[] strs) {
        String check=strs[0];
        for(int i=0;i< check.length();i++){
            char ch=check.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    return check.substring(0,i);
                }

            }
            
        }
        return check;  
    }
}