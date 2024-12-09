class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer=0;
        for(int i =0;i<absolutes.length;i++){
            if(signs[i]==false){
                absolutes[i]=0-absolutes[i];
            }
            answer += absolutes[i];
            System.out.println(absolutes[i]);
        }
        
        return answer;
    }
}