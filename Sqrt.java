/* 
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in C++ or x ** 0.5 in Python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
*/

class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1)
            return x;
        int left = 1;
        int right = x;
        while(left <= right){
            int mid = left + (right - left) / 2;
            long rootSquared = (long) mid * mid;

            if(rootSquared == x)
                return mid;
            else if(rootSquared < x)
                left = mid + 1;
            else
                right = mid - 1;         
        }    
        
        return right;
    }
}
