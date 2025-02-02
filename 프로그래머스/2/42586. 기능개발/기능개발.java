import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            int day=0;
            if((100-progresses[i]) % speeds[i] !=0){
                day = (100-progresses[i]) / speeds[i] +1;
            }else{
                day = (100-progresses[i]) / speeds[i];
            }
            queue.offer(day);
        }
        List<Integer> answer = new ArrayList<>();
        while(true){
            if(queue.isEmpty()){
                break;
            }
            int count=1;
            int first = queue.poll();
            while(true){
                 if(!queue.isEmpty() && first >=queue.peek()){
                    queue.poll();
                    count++;
                }else{
                     answer.add(count);
                     break;
                 }
            }
            
        }
        int[] ans = new int[answer.size()];
        int size=0;
        for(int ele : answer){
            ans[size++]=ele;
        }
        return ans;
    }
}