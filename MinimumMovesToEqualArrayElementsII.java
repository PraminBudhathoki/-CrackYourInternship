class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        //Sort the Array
        Arrays.sort(nums);
        //find the median
        int median = n%2==0 ? (nums[n/2]+nums[n/2-1])/2 : nums[n/2];
        int steps =0;
        //calculate steps
        for(int num:nums){
            steps += Math.abs(num-median);
        }
        return steps;
    }
}
