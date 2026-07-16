class Solution {
    public int lengthOfLongestSubstring(String s) {

        String a = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            while (a.contains(String.valueOf(s.charAt(i)))) {
                a = a.substring(1);
            }

            a += s.charAt(i);

            max = Math.max(max, a.length());
        }

        return max;
    }
}