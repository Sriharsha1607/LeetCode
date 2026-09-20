class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            sum = sum + ((123-(int)s.charAt(i)) * (i+1));
        }
        return sum;
    }
}