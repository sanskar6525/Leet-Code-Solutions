// Find All Anagrams in a String
// https://leetcode.com/problems/find-all-anagrams-in-a-string/

class Solution
{
    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length())
        {
            return result;
        }
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (char c : p.toCharArray())
        {
            pCount[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++)
        {
            sCount[s.charAt(i) - 'a']++;
            if (i >= p.length())
            {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }
            if (i >= p.length() - 1 && isAnagram(pCount, sCount))
            {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }
    static boolean isAnagram(int[] pCount, int[] sCount)
    {
        for (int i = 0; i < 26; i++)
        {
            if (pCount[i] != sCount[i])
            {
                return false;
            }
        }
        return true;
    }
}
