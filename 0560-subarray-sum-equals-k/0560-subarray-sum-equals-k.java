class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int presum=0;
        int count=0;
        Map<Integer,Integer> ans=new HashMap<>();
        ans.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            presum=presum+nums[i];
            int remove=presum-k;
            count= count + ans.getOrDefault(remove,0);
            ans.put(presum,ans.getOrDefault(presum,0)+1);
        }   
        return count;
    }
}