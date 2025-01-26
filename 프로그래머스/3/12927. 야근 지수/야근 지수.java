import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        long sum=0;
        for(int work : works){
            sum+=work;
        }
        if(sum <= n){
            return 0;
        }
        PriorityQueue<Integer> works2 = new PriorityQueue<>(Collections.reverseOrder());
        for(int work:works){
            works2.offer(work);
        }
        while(n>0){
            int maxWork = works2.poll();
            maxWork--;
            works2.offer(maxWork);
            n--;
        }
        while(!works2.isEmpty()){
            int work = works2.poll();
            answer+=(long) work * work;
        }
        return answer;
    }
}