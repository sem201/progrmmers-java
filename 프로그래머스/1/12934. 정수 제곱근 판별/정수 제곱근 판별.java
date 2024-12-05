class Solution {
    public long solution(long n) {
        long i=1;
        long answer=-1;
        while(i<=n){
            if(i*i==n){
                answer = (i+1)*(i+1);
                break;
            }
            i++;
        }
        
        return answer;
    }
}