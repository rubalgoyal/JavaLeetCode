/* Problem Description
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/

//Solution

class Solution {
    
    public String findCommonChar(String s1, String s2){
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < s2.length() && i < s1.length() ; i++){
            if(s1.charAt(i) == s2.charAt(i))
                result.append(s1.charAt(i));
            else
                break;         
        }
        return result.toString();
    }
    
    public String longestCommonPrefix(String[] strs) {
        String commonString = "";
        if(strs.length == 0)
            return commonString;
        else{
            commonString = strs[0];
        }    
        for(int i = 1; i <= strs.length -1 ; i++ ){
            commonString = findCommonChar(commonString, strs[i]);
            if(commonString.length()== 0)
                break;
        }
        return commonString;
    }
}
