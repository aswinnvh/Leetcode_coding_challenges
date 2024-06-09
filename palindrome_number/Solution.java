class Solution {
    public boolean isPalindrome(int x) {


        int temp = x;
        int reverseOfNumber = 0;
        int remainder = 0;

        while(x > 0) {
            remainder = x % 10;
            reverseOfNumber = (reverseOfNumber * 10) + remainder;
            x = x / 10;
        }

        if(temp == reverseOfNumber) {
            return true;
        }
        else {
            return false;
        }
    }
}