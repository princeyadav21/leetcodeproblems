class Solution {
    public double myPow(double x, int n) 
    {
        long N=n;
        if(N<0)
        {
            return 1/helper(x,-N);
        }
        return helper(x,N);
    }
    private double helper(double x,long n)
    {
        if(n==0)
        {
            return 1;
        }
        double halfpower=helper(x,n/2);
        double halfpowersq=halfpower*halfpower;
        if(n%2!=0)
        {
            halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }
}