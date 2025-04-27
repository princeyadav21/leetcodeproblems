class Solution {
    public boolean judgeCircle(String moves) 
    {
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++)
        {
            char dir=moves.charAt(i);
            if(dir=='U')
            {
                y++;
            }
            if(dir=='D')
            {
                y--;
            }
            if(dir=='L')
            {
                x--;
            }
            if(dir=='R')
            {
                x++;
            }
        }
        if(x==0 && y==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}