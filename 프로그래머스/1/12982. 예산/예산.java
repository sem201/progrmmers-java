import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int total = 0;
        int cnt = 0;
        Arrays.sort(d);
        for (int i=0;i<d.length;i++){
            total += d[i];
            cnt++;
            if(total > budget){
                total -= d[i];
                cnt--;
                break;
            }
        }
        
        return cnt;
    }
}