class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        if(2L*k+1 > nums.length){
            return ans;
        }
        long sum = 0;
        for(int i=0;i<2*k+1;i++){
            sum += nums[i];
        }
        ans[k] = (int)(sum/(2*k+1));
        for(int i=k+1;i<nums.length-k;i++){
            sum += nums[i+k];
            sum -= nums[i-k-1];
            ans[i] = (int)(sum/(2*k+1));
        }
        return ans;
    }
}