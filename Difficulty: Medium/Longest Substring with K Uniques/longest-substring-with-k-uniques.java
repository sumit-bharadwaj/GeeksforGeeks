import java.util.HashMap;
import java.util.Map;

class Solution{
    public int longestKSubstr(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int maxLen = -1;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);

            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }

            if (freq.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
  }