import java.util.HashMap;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer=0;
        HashMap<String,Integer> wants = new HashMap<String, Integer>();
        for(int i=0; i<want.length;i++){
            wants.put(want[i],number[i]);
        }
       for(int start =0;start<=discount.length-10; start++){
           HashMap<String, Integer> currentMap = new HashMap<>(wants);
            boolean isValid = true;
           
           for(int i=start; i<start+10;i++){
               String item=discount[i];
               if(currentMap.containsKey(item)){
                   currentMap.put(item,currentMap.get(item)-1);
               }
           }
           for(int value: currentMap.values()){
               if(value>0){
                   isValid=false;
                   break;
               }
           }
           if(isValid){
               answer++;
           }
       }
       
        return answer;
    }
}