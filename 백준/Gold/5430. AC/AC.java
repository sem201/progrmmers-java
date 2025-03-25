import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입출력을 위해 BufferedReader와 StringBuilder 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int t = 0; t < T; t++) {
            // 프로그램 함수(명령어 문자열) 읽기
            String p = br.readLine();
            // 배열의 원소 개수 읽기
            int n = Integer.parseInt(br.readLine());
            // 배열 문자열 읽기 (예: "[1,2,3,4]")
            String arrStr = br.readLine().trim();
            // 양 끝의 대괄호 제거
            arrStr = arrStr.substring(1, arrStr.length() - 1);
            
            // Deque를 사용하여 배열을 저장 (정수 저장)
            Deque<Integer> deque = new LinkedList<>();
            if(n > 0 && !arrStr.isEmpty()){
                String[] tokens = arrStr.split(",");
                for(String token : tokens) {
                    deque.add(Integer.parseInt(token.trim()));
                }
            }
            
            boolean reversed = false; // 현재 배열이 반전 상태인지 여부
            boolean error = false;
            
            // p에 포함된 각 명령을 처리
            for (char c : p.toCharArray()) {
                if (c == 'R') {
                    // reverse 명령: 단순히 reversed 플래그를 뒤집음
                    reversed = !reversed;
                } else if (c == 'D') {
                    // D 명령: 배열에서 첫 원소 제거 (reverse 상태에 따라 앞 또는 뒤 제거)
                    if (deque.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (reversed) {
                        deque.removeLast();
                    } else {
                        deque.removeFirst();
                    }
                }
            }
            
            if (error) {
                sb.append("error\n");
            } else {
                sb.append("[");
                // 결과 배열을 올바른 순서로 출력
                while (!deque.isEmpty()) {
                    if (reversed) {
                        sb.append(deque.removeLast());
                    } else {
                        sb.append(deque.removeFirst());
                    }
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]\n");
            }
        }
        
        System.out.print(sb);
    }
}
