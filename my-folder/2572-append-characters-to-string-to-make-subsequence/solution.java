class Solution {
    public int appendCharacters(String s, String t) {
        int ls=s.length();
        int lt=t.length();
        int is=0;
        int it=0;
        while(is<ls && it<lt)
        {
            if(t.charAt(it)==s.charAt(is))
            {
                is++;
                it++;
            }
            else
                is++;
        }
        if(it==lt)
            return 0;
        else
            return lt-it;
    }
}
