class Solution {
    public int solution(String t, String p) {
        int arrLength = t.length() - p.length() +1;
        String[] arrs = new String[arrLength];
        int answer = 0;
        for(int i=0; i<arrLength;i++){
            arrs[i] = t.substring(i,i+p.length());
        }
        for(int i=0;i<arrLength;i++){
            if(Long.parseLong(arrs[i])<=Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}