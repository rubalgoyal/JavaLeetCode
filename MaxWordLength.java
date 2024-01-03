class Solution {
    public int lengthOfLastWord(String s) {
        int maxLength = 0;
        int currentLength = 0;
        for(int i = 0; i <= s.length() -1; i++){
            if(s.charAt(i) == ' '){
                if(currentLength > maxLength){
                    maxLength = currentLength;
                }
                currentLength = 0;
            }
            else
                currentLength++;
        }
        if(currentLength > maxLength)
            maxLength = currentLength;
        return maxLength;
    }
}
