import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        HashSet<Integer> arr = new HashSet<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(bf.readLine()," ");
            String str = st.nextToken();
            int k=0;
            if(st.hasMoreTokens()){
                k = Integer.parseInt(st.nextToken());
            }

            switch (str){
                case "add":
                    arr.add(k);
                    break;

                case "remove":

                    arr.remove(k);
                    break;

                case "check":
                    sb.append(arr.contains(k) ? "1\n" : "0\n");
                    break;

                case "toggle":
                    if(arr.contains(k)){
                        arr.remove(k);
                    }else{
                        arr.add(k);
                    }
                    break;

                case "all":
                    arr.clear();
                    for(int t =1; t<21;t++){
                        arr.add(t);
                    }
                    break;

                case "empty":
                    arr.clear();
                    break;
            }
        }
        System.out.println(sb);
    }
    
}
