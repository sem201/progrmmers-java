import java.util.Arrays;


class Solution {
    public String solution(String s) {
        String answer ="";
        
        char[] tmp = s.toCharArray();
        Arrays.sort(tmp);
        StringBuilder temp = new StringBuilder(new String(tmp));
        answer = temp.reverse().toString();
        return answer;
    }
}