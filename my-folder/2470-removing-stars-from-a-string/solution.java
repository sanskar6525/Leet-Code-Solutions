class Solution {
    public String removeStars(String s) {
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            String t=s.substring(i,i+1);
            if(!t.equals("*"))
                stack.push(t);
            else
                stack.pop();
        }
        String res="";
        while(!stack.isEmpty())
        {
            res=stack.pop()+res;
        }
      
        return res;
    }
}
