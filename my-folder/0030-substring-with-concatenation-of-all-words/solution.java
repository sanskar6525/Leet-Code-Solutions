import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }
        
        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;
        Map<String, Integer> wordMap = new HashMap<>();
        
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        
        for (int i = 0; i < wordLength; i++) {
            int left = i;
            int right = i;
            int count = 0;
            Map<String, Integer> seenWords = new HashMap<>();
            
            while (right + wordLength <= s.length()) {
                String word = s.substring(right, right + wordLength);
                right += wordLength;
                
                if (wordMap.containsKey(word)) {
                    seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
                    count++;
                    
                    while (seenWords.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLength);
                        seenWords.put(leftWord, seenWords.get(leftWord) - 1);
                        left += wordLength;
                        count--;
                    }
                    
                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    seenWords.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(solution.findSubstring(s, words)); // Output: [0, 9]
        
        s = "wordgoodgoodgoodbestword";
        words = new String[]{"word","good","best","word"};
        System.out.println(solution.findSubstring(s, words)); // Output: []
        
        s = "barfoofoobarthefoobarman";
        words = new String[]{"bar","foo","the"};
        System.out.println(solution.findSubstring(s, words)); // Output: [6, 9, 12]
    }
}

