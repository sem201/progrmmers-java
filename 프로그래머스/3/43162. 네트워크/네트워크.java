class Solution {
    public int solution(int n, int[][] computers) {
        int[] visited = new int[n];
        int answer=0;
        for(int i=0; i<n;i++){
            if(dfs(n,computers,i,visited)){
                answer++;
            }
        }
        
        return answer;
    }public static boolean dfs(int n,int[][] computers,int node,int[] visited){
        if (visited[node]==0){
            visited[node]=1;
            for(int i=0; i<n; i++){
                if(node!=i && computers[node][i]==1){
                    dfs(n,computers,i,visited);
                }
            }
            return true;
        }
        return false;
        
        
    }
}