class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        // int count = 0;
        // int n = nums.length;
        // int ans = Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==1){
        //         ans = Math.min(count,ans);
        //         count = 0;
        //     }
        //     if(nums[i]==0){
        //         count++;
        //     }
        // }
        // if(ans >= k){
        //     return true;
        // }
        // return false;

        int count = 0;
        boolean firstOneFound = false;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (firstOneFound) {
                    ans = Math.min(ans, count);
                }
                firstOneFound = true;
                count = 0;
            } else if (firstOneFound) {
                count++;
            }
        }

        return ans >= k;
    }
}