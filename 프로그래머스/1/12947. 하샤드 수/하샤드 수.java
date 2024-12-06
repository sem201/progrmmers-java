class Solution {
    public boolean solution(int x) {
        int total = 0;
        int num =x;
        boolean answer;
        while(x!=0){
            total += x%10;
            x /=10;
        }
        if(num % total==0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
        
    }
}