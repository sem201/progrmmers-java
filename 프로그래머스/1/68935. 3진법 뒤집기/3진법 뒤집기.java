class Solution {
    public int solution(int n) {
        String num = toThree(n);
        int length = num.length();
        int answer =0;
        for(int i=0; i<length;i++){
            answer+=(num.charAt(i)-'0') * Math.pow(3,length-i-1);
        }
        return answer;
        
    }
    
    public static String toThree(int n){
        String num = "";
        while(n>=1){
            if(n%3==0){
                num+="0";
            }else if(n%3==1){
                num +="1";
            }else{
                num +="2";
            }
            n /= 3;
        }
        return num;
    }
}