
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N];
        int[] newArr = new int[N];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<N;i++){
            arr[i] = newArr[i]= Integer.parseInt(st.nextToken());

        }

        Arrays.sort(newArr);
        int rank=0;
        for(int v : newArr){
            if(!map.containsKey(v)){
                map.put(v,rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int k : arr){
            int ranking = map.get(k);
            sb.append(ranking).append(" ");
        }
        System.out.println(sb);

    }
}
