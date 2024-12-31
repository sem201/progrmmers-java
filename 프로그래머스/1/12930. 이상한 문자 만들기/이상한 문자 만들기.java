class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        String answer="";
        int idx=0;
        for (int i = 0; i <str.length ; i++) {
            if(str[i].equals(" ")){
                idx=0;
                answer += " ";
                continue;
            }else if(idx%2==0){
                str[i] = str[i].toUpperCase();
            }else{
                str[i] = str[i].toLowerCase();
            }
            idx++;
            answer += str[i];
        }
        return answer;
    }
}