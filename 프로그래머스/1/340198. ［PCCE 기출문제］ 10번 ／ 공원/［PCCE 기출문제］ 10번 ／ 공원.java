import java.util.Arrays;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int n= park.length;
        int m = park[0].length;
        Arrays.sort(mats);
        for(int i=0; i<mats.length/2; i++){
            int temp = mats[i];
            mats[i] = mats[mats.length -i -1];
            mats[mats.length -1 -i] = temp;
        }
        
        for (int mat:mats){
            for (int i=0; i<=n-mat;i++){
                for(int j=0; j<=m-mat;j++){
                    if(canPlace(park, i,j,mat)){
                        return mat;
                    }
                }
            }
        }
        return -1;
    }
    private boolean canPlace(String[][] park, int x, int y, int s){
        for(int i=0; i<s; i++){
            for(int j=0; j<s; j++){
                if(!park[x+i][y+j].equals("-1")){
                    return false;
                }
            }
        }
        return true;
    }
}