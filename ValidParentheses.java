/* Problem description
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:
Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 
Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

// Solution
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        boolean result = false;
        Stack<Character> stack = new Stack<Character>();
        if (s.length() == 0)
            return result = false;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == ('(') || currentChar == ('{') || currentChar == ('['))
                stack.push(currentChar);
            else if (currentChar == (')')) {
                if (currentChar == (')') && stack.empty()) {
                    result = false;
                    break;
                }
                else if (currentChar == (')') && stack.peek() == ('(')) {
                        stack.pop();
                        result = true;
                }
                else
                    stack.push(currentChar);
            }
            else if (currentChar == (']')) {
                if (currentChar == (']') && stack.empty()) {
                        result = false;
                        break;
                }
                else if (currentChar == (']') && stack.peek() == ('[')) {
                        stack.pop();
                        result = true;
                }
                else
                    stack.push(currentChar);
            }
            else if (currentChar == ('}')) {
                if (currentChar == ('}') && stack.empty()) {
                        result = false;
                        break;
                }
                else if (currentChar == ('}') && stack.peek() == ('{')) {
                        stack.pop();
                        result = true;
                }
                else
                    stack.push(currentChar);
            }
            else
                break;
        }
        if(!stack.empty())
            result = false;

        return result;
        
    }


}
