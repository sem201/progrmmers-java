import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    static Stack<Score> st = new Stack<>();
    static HashMap<Character,Integer> map = new HashMap<>();
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map.put('-',1);
        map.put('+',1);
        map.put('/',2);
        map.put('*',2);
        sb = new StringBuilder();


        String str = br.readLine();
        int len = str.length();

        for(int i=0; i<len;i++){
            char x = str.charAt(i);

            if(x>=65 && x<=90){
                sb.append(x);
            }
            else{
                if(x=='('){
                    st.add(new Score('(',0));
                    continue;
                }
                if(x==')'){
                    while (!st.isEmpty() && st.peek().x != '(') {
                        sb.append(st.pop().x);
                    }
                    if(!st.isEmpty()){
                        st.pop();
                    }
                    continue;
                }
                insert(x);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop().x);
        }
        System.out.println(sb);
    }
    public static void insert(char x){
        int pri = map.get(x);
        while (!st.isEmpty() && st.peek().pri >= pri) {
            sb.append(st.pop().x);
        }
        st.add(new Score(x, pri));

    }
}

class Score{
    public char x;
    public int pri;

    public Score(char x, int pri){
        this.x =x;
        this.pri = pri;
    }
}
