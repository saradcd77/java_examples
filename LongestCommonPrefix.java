/***
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

public class LongestCommonPrefix {
    
    public static String longestCommonPrefix(String [] strs){
       if (strs.length == 0){
           return "";
       }
       if (strs.length == 1){
           return strs[0];
       }
        String res = strs[0];

        for (int i = 0; i < strs.length; i++){

            String curr = strs[i];
            int currlen = Math.min(res.length(), curr.length());
            if (currlen == 0){
                return "";
            }
            for (int j=0; j < currlen; j++){
                if (j == currlen - 1){
                    if (res.charAt(j) == curr.charAt(j) && res.length() > curr.length()){
                        res = curr;
                    }
                }
                if (res.charAt(j) != curr.charAt(j)){
                    res = res.substring(0, j);
                    break;
                }
            }
        }
        return res;
    }
}
