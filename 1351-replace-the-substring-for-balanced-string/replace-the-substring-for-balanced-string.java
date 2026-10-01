class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int limit = n / 4;
        int[] count = new int[128];

        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }

        if (count['Q'] == limit && count['W'] == limit && count['E'] == limit && count['R'] == limit) {
            return 0;
        }

        int res = n;
        for (int i = 0, j = 0; i < n; i++) {
            count[s.charAt(i)]--;
            while (j <= i && count['Q'] <= limit && count['W'] <= limit && count['E'] <= limit && count['R'] <= limit) {
                res = Math.min(res, i - j + 1);
                count[s.charAt(j)]++;
                j++;
            }
        }
        return res;
    }
}