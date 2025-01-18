import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Set<String> wordsSet = new HashSet<>();
        
        for(int i=0; i<words.length;i++){
            if(wordsSet.contains(words[i])){
                answer[0] = (i%n) +1;
                answer[1] = (i/n) + 1;
                break;
            }
            wordsSet.add(words[i]);
            
            if(i>0 && words[i-1].charAt(words[i-1].length()-1)!= words[i].charAt(0)){
                answer[0] = (i%n) +1;
                answer[1] = (i/n) +1;
                break;
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
        System.out.println("Hello Java");

        return answer;
    }
}