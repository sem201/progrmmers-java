import java.util.LinkedList;
import java.util.List;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> caches = new LinkedList<>();
        if(cacheSize==0){
            return cities.length*5;
        }
        for(String city: cities){
            city = city.toLowerCase();
            if(!caches.contains(city)){
                answer=answer+5;
                if(cacheSize <= caches.size()){
                    caches.remove(0);
                }
                caches.add(city);
            }else{
                caches.remove(city);
                caches.add(city);
                answer++;
            }
        }
        return answer;
    }
}