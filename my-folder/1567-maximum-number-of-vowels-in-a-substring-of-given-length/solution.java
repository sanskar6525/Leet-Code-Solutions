class Solution {
    static int check(String s)
    {
        int vowels=0;
        Character[] samp = {'a','i','e','o','u'};
        ArrayList<Character> L = new ArrayList<>(Arrays.asList(samp));
        char[] c=s.toCharArray();
        for(char ch:c)
        {
            if(L.contains(ch))
                vowels++;
        }
        return vowels;
    }
    public int maxVowels(String s, int k) {
        
        Character[] samp = {'a','i','e','o','u'};
        ArrayList<Character> L = new ArrayList<>(Arrays.asList(samp));
        String sub=s.substring(0,k);
        int sum=check(sub);
        int res=Math.max(0,sum);
        int l=s.length();
        //System.out.println(sub+"\t"+sum);
        for(int i=1;i<=l-k;i++)
        {
            if(L.contains(sub.charAt(0)))
            {
                sum--;
                sub=s.substring(i,i+k);
                if(L.contains(sub.charAt(k-1)))
                    sum++;
            }
            else
            {
                sub=s.substring(i,i+k);
                if(L.contains(sub.charAt(k-1)))
                    sum++;
            }
            //System.out.println(sub+"\t"+sum);
            if(res<sum)
                res=sum;

           
        }

        return res;
    }
}
