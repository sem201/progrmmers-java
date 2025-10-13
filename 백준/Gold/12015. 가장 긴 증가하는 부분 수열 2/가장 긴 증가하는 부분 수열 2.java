import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] LIS = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        LIS[0] = arr[0];
        int LenLIS = 1;
        for(int i=1; i<N; i++){
            int key = arr[i];

            if(LIS[LenLIS - 1] < key){
                LenLIS ++;
                LIS[LenLIS - 1] = key;
            }else{
                int left =0;
                int right = LenLIS;
                while(left < right){
                    int mid = (right + left) / 2;
                    
                    if(LIS[mid] < key){
                        left = mid +1;
                    }else{
                        right = mid;
                    }
                }
                LIS[left] = key;
            }
        }
        System.out.println(LenLIS);
    }
}
