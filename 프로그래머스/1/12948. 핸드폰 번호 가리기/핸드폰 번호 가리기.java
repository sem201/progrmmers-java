
class Solution {
    public String solution(String phone_number) {
        if(phone_number.length()==4){
            return phone_number;
        }else{
        int num = phone_number.length()-4;
        String star="*";
        for(int i=1;i<num;i++){
            star+="*";
        }
        phone_number=star+phone_number.substring(num);
        return phone_number;
            }
    }
}