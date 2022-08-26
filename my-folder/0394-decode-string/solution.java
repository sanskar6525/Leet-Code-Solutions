class Solution {
    Integer next = 0;
    public String decodeString(String s) {
        return decodeString(s, 0);
    }
    
    public String decodeString(String s, int start){
        StringBuilder sb=new StringBuilder();
        char[] arr = s.toCharArray();
        int num=0;

        for(int i=start;i<arr.length;i++){
            char c = arr[i];            
            if(Character.isDigit(c)){
                if(num>0)
                    num=10*num+Character.getNumericValue(c);
                else num = Character.getNumericValue(c);
            }
            else if(c=='['){
                String temp = decodeString(s,i+1);                   
                for(int j=0;j<num;j++)
                    sb.append(temp);
                num=0;
                i=next;
            }
            else if(c==']'){
                    next=i;                   
                    return sb.toString();                
            }
            else sb.append(c);
        }
        return sb.toString();
    }
}
