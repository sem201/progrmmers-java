
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i =0 ; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr,M);
        System.out.println(result);
    }
    static int search(int[] arr, int M){
        int sum =0;
        int size = arr.length;
        for(int i=0; i<size-2; i++){
            for(int k=i+1;k<size-1; k++){
                for(int j=k+1;j<size; j++){
                    int temp = arr[i] + arr[k] + arr[j];

                    if(M == temp){
                        return temp;
                    }

                    if(sum < temp && temp <M){
                        sum = temp;
                    }
                }
            }
        }
        return sum;
    }
}
