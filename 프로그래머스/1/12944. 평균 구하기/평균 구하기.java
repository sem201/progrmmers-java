class Solution {
    public double solution(int[] arr) {
        double total =0.0;
        for(int i=0;i<=arr.length-1;i++){
            total += arr[i];
        }
        double answer = total/arr.length;
        return answer;
    }
}