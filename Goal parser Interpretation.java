class Solution {
    public String interpret(String command) {
        StringBuilder s1=new StringBuilder("");
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            {
                s1.append("G");
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')')
            
                s1.append("o");
            
            else {
                s1.append("al");
            }  
        }
        }
        return s1.toString();
    }
}
