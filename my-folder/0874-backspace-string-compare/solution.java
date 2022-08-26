class Solution {
    public boolean backspaceCompare(String s, String t) {
      Stack<Character> stackT=new Stack<>();
      Stack<Character> stackS=new Stack<>();
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='#' && !stackS.isEmpty())
          stackS.pop();
        else if(s.charAt(i)!='#')
          stackS.push(s.charAt(i));
      }
      for(int i=0;i<t.length();i++){
        if(t.charAt(i)=='#' && !stackT.isEmpty())
          stackT.pop();
        else if(t.charAt(i)!='#')
          stackT.push(t.charAt(i));
      } 
      
      boolean isPoped=false;
      while(!stackS.isEmpty() && !stackT.isEmpty()){
        
        isPoped=false;
        if(stackS.peek()==stackT.peek())
        {
          stackS.pop();
          stackT.pop();
          isPoped=true;
        }
        if(!isPoped)
          break;
      }
      return stackT.isEmpty() && stackS.isEmpty();
        
    }
}

