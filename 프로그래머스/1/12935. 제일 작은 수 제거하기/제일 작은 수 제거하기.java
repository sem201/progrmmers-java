import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        for(int num:arr){
            list.add(num);
        }
        
        int small = arr[0];
        for (int i=1;i<arr.length;i++){
            if(small > arr[i]){
                small = arr[i];
            }
        }
        list.remove(Integer.valueOf(small));
        if(list.isEmpty()){
            return new int[]{-1};
        }
        int[] answer = new int[list.size()];
        for (int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}