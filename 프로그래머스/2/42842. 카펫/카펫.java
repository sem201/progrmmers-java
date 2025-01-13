class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpet = brown + yellow;
        
        for(int i=3;i<=carpet;i++){
            int row = i;
            int col = carpet/i;
            
            if(col < 3){
                continue;
            }
            if((row-2)*(col-2)==yellow){
                answer[0] = col;
                answer[1] = row;
                break;
            }
        }
        return answer;
    }
}