class Solution {
    public int solution(String s) {
        String answer="";
        for(int i=0;i<s.length();i++){
            if(isNum(s.substring(i,i+1))){
                answer += s.substring(i,i+1);
            }else{
                switch(s.substring(i,i+3)){
                    case "zer":{answer += "0"; i=i+3;break;}
                    case "one":{answer += "1"; i=i+2;break;}
                    case "two":{answer += "2"; i=i+2;break;}
                    case "thr":{answer += "3"; i=i+4;break;}
                    case "fou":{answer += "4"; i=i+3;break;}
                    case "fiv":{answer += "5"; i=i+3;break;}
                    case "six":{answer += "6"; i=i+2;break;}
                    case "sev":{answer += "7"; i=i+4;break;}
                    case "eig":{answer += "8"; i=i+4;break;}
                    case "nin":{answer += "9"; i=i+3;break;}
                }
            }
        }
        return Integer.parseInt(answer);
    }
    public static boolean isNum(String s){
        int asci = s.charAt(0);
        if(asci >=48 && asci <= 57){
            return true;
        }
        return false;
    }
}