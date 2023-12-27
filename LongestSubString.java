/*
Problem Statement

Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Queue<Character> subString = new LinkedList<>();
        Character currentChar;
        for(int i = 0; i<s.length(); i++){
            currentChar = s.charAt(i);
            if(!subString.contains(currentChar)){
                subString.add(currentChar);             
            }              
            else{
                if(subString.size() > maxLength)
                    maxLength = subString.size();
                while(true){
                    if(subString.peek()!= currentChar){
                        subString.poll();
                    }
                    else{
                        subString.poll();
                        subString.add(currentChar);
                        break;
                    }

                }
                
            }              
        }
        if(subString.size() > maxLength)
            maxLength = subString.size();
        return maxLength;       
    }
}
