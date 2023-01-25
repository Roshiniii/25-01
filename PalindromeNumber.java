//Given an integer x, return true if x is a palindrome, and false otherwise.
class Solution {
    public boolean isPalindrome(int x) {
        int rem,sum=0,temp = x;
        while(x>0){
            rem = x%10;
            sum = (sum*10)+rem;
            x=x/10;
        }
        return temp==sum;
    }
}
