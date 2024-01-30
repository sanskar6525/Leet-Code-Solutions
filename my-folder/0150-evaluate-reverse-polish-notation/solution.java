class Solution {
    public int evalRPN(String[] tokens) {
        //Stack to store the operands in the correct order
        Stack<Integer> s=new Stack<>();
        //List containing all the operators to match with 
        List<String> L=new ArrayList<>();
        L.add("+");
        L.add("-");
        L.add("/");
        L.add("*");
        for(String i:tokens)
        {
            if(!L.contains(i))
                s.add(Integer.parseInt(i)); 
            else
            {
                int a=s.pop();
                int b=s.pop();
                if(i.equals(L.get(0)))
                    s.push(b+a);
                else if(i.equals(L.get(1)))
                    s.push(b-a);
                else if(i.equals(L.get(2)))
                    s.push(b/a);
                else if(i.equals(L.get(3)))
                    s.push(b*a);
            }
        }
        return s.pop();
    }
}
