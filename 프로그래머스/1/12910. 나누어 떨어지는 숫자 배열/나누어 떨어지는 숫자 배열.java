import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List <Integer> templist =new ArrayList<>(); 
        
        for(int ar:arr){
            if(ar%divisor==0){
                templist.add(ar);
            }
        }
        if (templist.isEmpty()){
            templist.add(-1);
        }
        Collections.sort(templist);
        int[] answer = templist.stream().mapToInt(i->i).toArray();
        
            
        return answer;
    }
}