class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int bars=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='|')
            {
                bars++;
            }
            if(s.charAt(i)=='*' &&bars%2==0)
            {
                count++;
            }
        } 
        return count;
    }
}
