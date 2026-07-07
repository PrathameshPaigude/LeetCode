class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        StringBuilder build = new StringBuilder();
        long sum = 0;
        for( char num : str.toCharArray())
        {
            if( num != '0' ) 
            {
                build.append(num);
                sum = sum + num - 48;
                
            }
        }
        if(build.isEmpty()) return 0;
        long num = Integer.parseInt(build.toString());
        long ans = num * sum;
        return ans;
        
    }
}