class Solution {
    public boolean isPalindrome(String s) 
    {
        
        String input=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(input.isEmpty())
        {
            return true;
        }
        int start=0;
        int end=input.length()-1;
        return helper(input,start,end);
        
    }
    public boolean helper(String str,int start,int end)
    {
        if(start>=end)
        {
            return true;
        }
        if(start<0 || end>=str.length()){
            return false;
        }
        if(str.charAt(start) != str.charAt(end))
        {
            return false;
        }
        return helper(str,start+1,end-1);
    }
}