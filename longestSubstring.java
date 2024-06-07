class Solution {
    public int lengthOfLongestSubstring(String s) {

        int staticPointer = 0;
        int movingPointer = 0;
        int lengthOfSubstring = 0;

        HashSet<Character> hashSet = new HashSet();

        while (movingPointer < s.length()) {
            if(!hashSet.contains(s.charAt(movingPointer))) {
                hashSet.add(s.charAt(movingPointer));
                movingPointer++;
                lengthOfSubstring = Math.max(hashSet.size(), lengthOfSubstring);
            }
            else {
                hashSet.remove(s.charAt(staticPointer));
                staticPointer++;
            }
        }


        return lengthOfSubstring; 
    }
}