class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> S=new Stack<>();
        if(s.length()==0)
            return 0;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                S.push(ch);
            else if(ch==')' && !S.isEmpty())
                S.pop();
            else if(ch==')' && S.isEmpty())
                c++;
        }
        while(!S.isEmpty())
        {
            S.pop();
            c++;
        }
        return c;
    }
}
