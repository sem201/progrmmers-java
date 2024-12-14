class Solution {
    public int solution(int left, int right) {
        int[] numbers=new int[right-left+1];
        
        for(int i=left;i<=right;i++){
            int cnt=0;
            for(int k=1;k<i;k++){
                if(i%k==0){
                    cnt++;
                }
            }
            if(cnt%2==0){
                numbers[i-left]=i;
            }else{
                numbers[i-left]=-i;
            }
        }
        int answer=0;
        for(int number:numbers){
            answer+=-number;
        }
        
        return answer;
    }
}