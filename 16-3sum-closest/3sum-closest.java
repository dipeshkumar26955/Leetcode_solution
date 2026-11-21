class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // int sum=0;
        // int ans = Integer.MAX_VALUE;
        // for(int i=0;i<nums.length-2;i++){
        //     sum = nums[i]+nums[i+1]+nums[i+2];
        //     if(sum == target-1){
        //         return sum;
        //     }
        //     else if(sum == target+1){
        //         return sum;
        //     }
        //     else{
        //         ans = Math.max(ans,sum);
        //     }
        // }
        // return ans;

        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum; // exact match
                }
            }
        }
        return ans;
    }
}