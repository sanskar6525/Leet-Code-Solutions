
class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        // Map to store results of subproblems
        Map<Integer, List<String>> dp = new HashMap<>();

        // Iterate from the end of the string to the beginning
        for (int startIdx = s.length(); startIdx >= 0; startIdx--) {
            // List to store valid sentences starting from startIdx
            List<String> validSentences = new ArrayList<>();

            // Iterate from startIdx to the end of the string
            for (int endIdx = startIdx; endIdx < s.length(); endIdx++) {
                // Extract substring from startIdx to endIdx
                String currentWord = s.substring(startIdx, endIdx + 1);

                // Check if the current substring is a valid word
                if (isWordInDict(currentWord, wordDict)) {
                    // If it's the last word, add it as a valid sentence
                    if (endIdx == s.length() - 1) {
                        validSentences.add(currentWord);
                    } else {
                        // If it's not the last word, append it to each sentence formed by the remaining substring
                        List<String> sentencesFromNextIndex = dp.get(
                            endIdx + 1
                        );
                        for (String sentence : sentencesFromNextIndex) {
                            validSentences.add(currentWord + " " + sentence);
                        }
                    }
                }
            }
            // Store the valid sentences in dp
            dp.put(startIdx, validSentences);
        }
        // Return the sentences formed from the entire string
        return dp.getOrDefault(0, new ArrayList<>());
    }

    // Helper function to check if a word is in the word dictionary
    private boolean isWordInDict(String word, List<String> wordDict) {
        return wordDict.contains(word);
    }
}       
