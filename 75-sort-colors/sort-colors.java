class Solution {
    public void sortColors(int[] nums) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i: nums){
            if(i == 0) cnt0++;
            else if(i == 1) cnt1++;
            else cnt2++;
        }
        int k = 0;
        while(cnt0-- > 0) nums[k++] = 0;
        while(cnt1-- > 0) nums[k++] = 1;
        while(cnt2-- > 0) nums[k++] = 2;
    }
}