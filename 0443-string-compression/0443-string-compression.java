class Solution {
    public int compress(char[] chars) 
    {
        int index=0;
        int n=chars.length;
        for(int i=0;i<n;i++)
        {
            int count =0;
            char ch=chars[i];
            while(i<n && chars[i]==ch)
            {
                count++;
                i++;
            }
            chars[index++]=ch;
            if(count>1)
            {
                String str=Integer.toString(count);
                for(char dig:str.toCharArray())
                {
                    chars[index++]=dig;
                }
            }
            i--;
        }
        return index;
    }
}