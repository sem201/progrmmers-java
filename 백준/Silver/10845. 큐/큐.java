
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int k=0; k<N;k++){
            st = new StringTokenizer(br.readLine()," ");
            String str = st.nextToken();
            if(str.equals("push")){
                arr.add(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop")) {
                if(arr.isEmpty()){
                    sb.append(-1).append("\n");
                }else {
                sb.append(arr.get(0)).append("\n");
                arr.remove(0);
                }
            }else if(str.equals("size")){
                sb.append(arr.size()).append("\n");
            }else if(str.equals("empty")){
                if(arr.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            } else if (str.equals("front")) {
                if(arr.isEmpty()){
                    sb.append(-1).append("\n");
                }else {
                    sb.append(arr.get(0)).append("\n");
                }
            }else if (str.equals("back")){
                if(arr.isEmpty()){
                    sb.append(-1).append("\n");
                }else {
                    int lastidx = arr.size()-1;
                    sb.append(arr.get(lastidx)).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
