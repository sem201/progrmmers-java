
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> set = new HashSet<>();
        List<String> arr = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }
        for(int i=0; i<M; i++){
            String s = br.readLine();
            if(set.contains(s)){
                arr.add(s);
            }
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        for(String ele : arr){
            System.out.println(ele);
        }
    }
}
