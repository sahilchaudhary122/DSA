class Solution {
    public int subtractProductAndSum(int n) {
        int prdct=1;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum += digit;
            prdct *= digit;
            n = n/10;
        }
        return prdct-sum;
    }
}