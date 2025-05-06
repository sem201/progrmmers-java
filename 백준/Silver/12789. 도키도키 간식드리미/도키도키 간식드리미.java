import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<N; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int cnt =1;
        boolean result=true;
        while(!arr.isEmpty()){
            int x = arr.remove(0);
            if(x==cnt){
                cnt++;
            }else{
                stack.add(x);
            }

            while (!stack.isEmpty() && stack.peek() == cnt){
                stack.pop();
                cnt++;
            }
        }
        while(!stack.isEmpty()){
            if(stack.pop() != cnt){
                result = false;
                break;
            }
            cnt++;
        }

        if (result){
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
    }
}
