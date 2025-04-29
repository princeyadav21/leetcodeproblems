class Solution {
    public long countVowels(String word) 
    {
        long count=0;
        int n=word.length();
        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            if( word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
            {
                count=count+(long)(i+1)*(n-i);
            }
        }   
        return count;
    }
}