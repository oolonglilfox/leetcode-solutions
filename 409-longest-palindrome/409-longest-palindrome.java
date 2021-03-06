import java.util.HashMap;
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (int i=0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c)+1);
            } else {
                charMap.put(c, 1);
            }
        }
        Integer cnt = 0;
        Integer numOfOdd = 0;
        for (Integer v: charMap.values()) {
            if ((v & 1) == 0) {
                cnt += v;
            } else {
                cnt += v - 1;
                numOfOdd++;
            }
        }
        if (numOfOdd >= 1) {
            cnt++;
        }
        return cnt;
    }
    
}