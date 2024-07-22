/*
Problem Statement:
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
*/

/* With O(n) time and space complexity */

class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1){ 
            return true;
        }
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
         StringBuilder str1 = new StringBuilder();
        String regex = "[a-zA-Z0-9]";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( String.valueOf(c).matches(regex)){
                str.append(Character.toLowerCase(c));
                stack.push(Character.toLowerCase(c));
            }
        }
        String first = str.toString();
        for(int i = 0; i < first.length(); i++){
            str1.append(stack.pop());
        }
        
        String second = str1.toString();      

        if(first.equals(second)){
            return true;
        }    
        return false;
    }
}
