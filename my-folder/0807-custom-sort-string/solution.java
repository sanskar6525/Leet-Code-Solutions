class Solution {
    public String customSortString(String order, String s) {
        char[] c=order.toCharArray();
        //System.out.println(c[1]);
        String match="";
        String unmatched="";
        for(char ch:c)
        {

            while(s.indexOf(ch)!=-1)
            {
                match=match+ch;
                String t=""+ch;
                s=s.replaceFirst(t,"");
            }

        }
        System.out.println(match+"  "+s);
        return match+s;
    }
}
