class Solution {
    public int solution(int n) {
        String origin = Integer.toBinaryString(n);
        int count = origin.replace("0","").length();
        String newNum="";
        int newCount;
        while(true){
            n++;
            newNum = Integer.toBinaryString(n);
            newCount = newNum.replace("0","").length();
            if(newCount == count){
                break;
            }
        }
        return n;
    }
}