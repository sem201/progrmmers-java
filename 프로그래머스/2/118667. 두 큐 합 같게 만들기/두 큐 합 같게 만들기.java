import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer=0;
        int max = queue1.length + queue2.length +2;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i=0; i<queue1.length;i++){
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        long sum1 = getSum(q1);
        long sum2 = getSum(q2);
        while(sum1!=sum2){
            if(sum1>sum2){
                int value = q1.poll();
                sum1 -=value;
                sum2 +=value;
                q2.add(value);
            }else{
                int value = q2.poll();
                sum1 +=value;
                sum2 -=value;
                q1.add(value);
            }
            answer ++;
            if(answer > max){
                answer = -1;
                break;
            }
            
        }
        return answer;
    }
    public static long getSum(Queue<Integer> queue){
        long total =0;
        for(int value : queue){
            total += value;
        }
        return total;
    }
}