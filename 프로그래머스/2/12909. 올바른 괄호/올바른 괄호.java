import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<>();
        for(char c :s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }else if(c=='('){
                stack.push('(');
            }else{
                if(stack.peek()=='('){
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            answer = true;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}