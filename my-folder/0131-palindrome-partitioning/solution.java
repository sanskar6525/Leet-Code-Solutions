
 class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        int n = s.length();
        
        getAllPartitions(s, n, 1, new ArrayList<>(List.of(s.substring(0, 1))), res);
        return res;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private void getAllPartitions(String s, int n, int curInd, List<String> curList, List<List<String>> res) {
        boolean isLastPalindrome = isPalindrome(curList.get(curList.size() - 1));
        if (curInd == n) {
            if (isLastPalindrome) {
                res.add(new ArrayList<>(curList));
            }
            return;
        }
        if (isLastPalindrome) {
            curList.add(String.valueOf(s.charAt(curInd)));
            getAllPartitions(s, n, curInd + 1, curList, res);
            curList.remove(curList.size() - 1);
        }
        curList.set(curList.size() - 1, curList.get(curList.size() - 1) + s.charAt(curInd));
        getAllPartitions(s, n, curInd + 1, curList, res);
        curList.set(curList.size() - 1, curList.get(curList.size() - 1).substring(0, curList.get(curList.size() - 1).length() - 1));
    }
}
