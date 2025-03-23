
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        HashMap<Integer, Integer> fruitsCnt = new HashMap<>();
        int max=0;
        int left=0;
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int right=0; right<N; right++){
            fruitsCnt.put(arr[right],fruitsCnt.getOrDefault(arr[right],0)+1);

            while(fruitsCnt.size()>2){
                fruitsCnt.put(arr[left],fruitsCnt.get(arr[left]) -1);

                if(fruitsCnt.get(arr[left])==0){
                    fruitsCnt.remove(arr[left]);
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}
