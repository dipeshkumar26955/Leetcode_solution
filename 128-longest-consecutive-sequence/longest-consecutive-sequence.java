class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // int count=0;
        // int longest = 1;
        // int lastsmaller = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     if(nums[i]-1 == lastsmaller){
        //         count++;
        //         lastsmaller=nums[i];
        //     }
        //     else if(nums[i] != lastsmaller){
        //         count = 1;
        //         lastsmaller = nums[i];
        //     } 
        //     longest = Math.max(longest,count);
        // }
        // return longest;


        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
}