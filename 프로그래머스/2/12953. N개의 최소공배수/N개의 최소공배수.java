import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer=arr[0];
        for(int i=1;i<arr.length;i++){
            answer=LCM(arr[i],answer);
        }
        return answer;
    }
    public int GCD(int a, int b){
        int r=0;
        while(b!=0){
            r= a%b;
            a=b;
            b=r;
        }
        return a;
    }public int LCM(int a,int b){
        return a*b/GCD(a,b);
    }
}