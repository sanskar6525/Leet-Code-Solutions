class Solution {
    public static int vowels(String s)
    {
        int c=0;
        List<Character> L=new ArrayList<>(){{add('a');add('e');add('i');add('o');add('u');}};
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(L.contains(ch))
                c++;
        }
        return c;
    }
    public boolean halvesAreAlike(String s) {
        int l=s.length();
        String s1=s.substring(0,l/2);
        s1=s1.toLowerCase();
        String s2=s.substring(l/2,l);
        s2=s2.toLowerCase();
        int c1=vowels(s1);
        int c2=vowels(s2);
        //System.out.println(c1);
        if(c1==c2)
            return true;
        else
            return false; 
    }
}
