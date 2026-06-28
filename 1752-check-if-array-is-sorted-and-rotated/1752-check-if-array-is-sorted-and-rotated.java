class Solution {
    public boolean check(int[] nums) {
        int temp = 0;
        for ( int i = 1; i < nums.length; i++)
        {
            if( nums[i] < nums[i-1]) temp++;
           
        }
        if ( nums[nums.length-1] > nums[0]) temp ++;
        return temp <= 1;
    }
}