class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[0].length;
        int[][] answer = new int[row][col];
        for(int i=0;i<arr1.length;i++){
            for(int t=0;t<arr1[0].length;t++){
                answer[i][t] = arr1[i][t] + arr2[i][t];
            }
        }
        return answer;
    }
}