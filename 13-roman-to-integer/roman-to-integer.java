class Solution {
    public int romanToInt(String s) {
        int[] values = new int[128];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;
        int total = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int currentVal = values[s.charAt(i)];
            if (i + 1 < n && currentVal < values[s.charAt(i + 1)]) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }
        return total;
    }
  
}