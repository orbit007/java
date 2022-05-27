class Solution {
    public int mySqrt(int x) {
        int lo=2;
        int hi=x/2;
        if(x<2)
        {
            return x;
        }
        while(lo<=hi)
        {    
            int mid=(lo+hi)/2;
            long sq= (long)mid*mid;
            if(sq>x)
            {
                hi=mid-1;
             }
            else if(sq<x)
            {
                lo=mid+1;
            }
            else{
                return mid;
            }
            
        }
        return hi;
        
    }
}