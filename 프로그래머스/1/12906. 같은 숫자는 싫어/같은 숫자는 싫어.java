import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<>();
        tempList.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                tempList.add(arr[i]);
            }
        }
        int[] answer = tempList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}