class Solution {
    public String solution(String s) {
        
        int idx =s.length()/2;
        String answer = "";
        if(s.length()%2==0){
            answer = String.valueOf(s.charAt(idx-1)) + String.valueOf(s.charAt(idx));
            
        }else{
            answer=String.valueOf(s.charAt(idx));
        }
        
        return answer;
    }
}