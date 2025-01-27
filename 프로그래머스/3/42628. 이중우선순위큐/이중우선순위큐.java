import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> reverse_pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<operations.length; i++){
            String temp[] = operations[i].split(" ");
            
            switch(temp[0]){
                case "I":
                    pq.add(Integer.parseInt(temp[1]));
                    reverse_pq.add(Integer.parseInt(temp[1]));
                    break;
                
                case "D":
                    if(!pq.isEmpty()){
                        if(Integer.parseInt(temp[1])==1){
                            int max = reverse_pq.poll();
                            pq.remove(max);
                        }else{
                            int min = pq.poll();
                            reverse_pq.remove(min);
                        }
                    }
                    break;
            }
        }
        if(pq.size()>=1){
            answer[0]=reverse_pq.poll();
            answer[1] = pq.poll();
        }
        
        return answer;
    }
}