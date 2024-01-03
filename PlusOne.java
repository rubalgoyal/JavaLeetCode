/* 
you are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

*/


class Solution {
    public int[] plusOne(int[] digits) {
        int carryOver = 0;
        for(int i = digits.length -1; i>= 0; i--){
            if( i == digits.length -1){
                carryOver = (digits[i] + 1 ) /10;
                digits[i] = (digits[i] + 1 ) % 10;
            }
            else if(carryOver > 0){
                int sum = digits[i] +carryOver;
                digits[i] = sum % 10;
                carryOver = sum /10;
            }
            else
                break;
        }
        if(carryOver > 0){
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carryOver;
            for(int i = 0; i <= digits.length -1 ; i++){
                newDigits[i+1] = digits[i];
            }
            return newDigits;
        }
        return digits;

    }
}
