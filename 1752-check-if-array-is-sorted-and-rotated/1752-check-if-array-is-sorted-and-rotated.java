class Solution {
    public static boolean check(int[] nums) 
    {
        int n=nums.length;
        int count =0;
        if(nums[0]<nums[n-1])
        {
            count++;
        }
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
                {
                  count++;
                }
            if(count>1)
            {
                return false;
            }
                
        }
        return true;
    }
    public static void main(String args[])
    {
        int nums[]={10,15,16,17,45};
        System.out.println(check(nums));
    }
}