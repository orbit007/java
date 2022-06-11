class Solution {
    
    public boolean cheak(int n)
    {
        int r=n;
        while(r>0)
        {
            int dig=r%10;
            if(dig==0) return false;
            if(n%dig !=0) return false;
            
            r=r/10;
            
        }
        
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> ans= new ArrayList<>();
        
        for(int ele=left;ele<=right;ele++)
        {
            if(cheak(ele)==true)
            {
                ans.add(ele);
            }
         }
        
        return ans;
        
    }
}