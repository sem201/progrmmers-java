import java.util.Arrays;
import java.util.Collections;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] B2 = new Integer[B.length];
        for(int i=0;i<B.length;i++){
            B2[i] = B[i];
        }
        Arrays.sort(A);
        Arrays.sort(B2,Collections.reverseOrder());
        for(int i=0;i<B.length;i++){
            answer += A[i]*B2[i];
        }
        System.out.println("Hello Java");

        return answer;
    }
}