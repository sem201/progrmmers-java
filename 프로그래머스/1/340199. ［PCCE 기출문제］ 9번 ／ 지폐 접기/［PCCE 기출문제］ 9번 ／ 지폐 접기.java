class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int width = wallet[0];
        int height = wallet[1];
        
        while(true){
            if((bill[0]<=width && bill[1]<=height) || (bill[1]<=width && bill[0]<=height)){
                break;
            }
            if(bill[0] > bill[1]){
                bill[0] /=2;
            }else{
                bill[1] /=2;
            }
            answer ++;
        }
        return answer;
    }
}