class Solution {
    public int[] solution(String s) {
        int countDelete = 0;
        int countToBin =0;
        int originLength;
        int[] answer = new int[2];
        while(true){
            if(s.equals("1")){
                answer[0] = countToBin;
                answer[1] = countDelete;
                break;
            }
            originLength = s.length();
            s=s.replace("0","");
            countDelete+=originLength-s.length();
            s = toBin(s);
            countToBin++;
        }
        
        return answer;
    }
    public static String toBin(String str){
        int length = str.length();
        StringBuffer bin= new StringBuffer();
        while(length>0){
            if(length%2==0){
                bin.append("0");
            }else{
                bin.append("1");
            }
            length /=2;
        }
        return bin.reverse().toString();
    }
}