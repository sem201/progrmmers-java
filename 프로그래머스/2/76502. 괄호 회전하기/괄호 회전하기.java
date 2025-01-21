import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length();i++){
            if(isRight(s)){
                answer++;
            }
            s = s.substring(1) + s.substring(0,1);
        }
        return answer;
    }
    public boolean isRight(String s){
        Stack<Character> stack = new Stack<>();
        char c ;
        char p;
        for (int i=0; i<s.length();i++){
            c= s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else{
                if(!stack.empty()){
                    p = stack.pop();
                    if(p=='(' && c==')'){
                        continue;
                    }else if(p=='[' && c ==']'){
                        continue;
                    }else if(p=='{' && c == '}'){
                        continue;
                    }
                }
                return false;
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }
}