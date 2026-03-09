class Solution {
    public boolean isPalindrome(int x) {
        if(x<10 && x>=0){
            return true;
        }
        if(x<0 || x%10 == 0){
            return false;
        }
        int rev = 0;
        while(x>rev){
            int lastDigit = x % 10;
            x = x/10;
            rev = rev*10 + lastDigit;
        }
        // 12 1
        return rev == x || rev / 10 == x;
    }
}
