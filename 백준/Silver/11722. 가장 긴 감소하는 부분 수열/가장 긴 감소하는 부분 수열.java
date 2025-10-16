import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] LIS = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lenLIS = 0;
        LIS[0] = arr[0];
        for(int i=1; i<N; i++){
            if(arr[i] < LIS[lenLIS]){
                LIS[++lenLIS] = arr[i];
            }
            else{
                int left =0;
                int right = lenLIS;
                int mid=0;
                while(left < right){
                    mid = (left + right) / 2;
                    if(LIS[mid] > arr[i]){
                        left = mid+1;
                    }
                    else{
                        right = mid;
                    }
                }
                LIS[left] = arr[i];
            }
        }
        System.out.println(lenLIS+1);
    }
}
