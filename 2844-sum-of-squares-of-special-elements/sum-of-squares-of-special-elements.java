class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        if(n == 0) return n;
        else{
            for(int i=0;i<n;i++){
                if(n % (i+1) == 0){
                    sum += (nums[i]*nums[i]);
                }
            }
            return sum;
        }
    }
}