class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int k = nums[i];
            int digits = 0;
            if (k == 0) digits = 1;
            
            while (k > 0)
            {
              k = k / 10;
              digits++;
            }
            if ( digits % 2 == 0){
                count++;
            }
           

        }
        return count;
    }
}