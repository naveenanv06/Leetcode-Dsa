class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visit=new boolean[rooms.size()];
        dfs(0,rooms,visit);
        for(int i=0;i<rooms.size();i++){
            if(!visit[i]) return false;
        }
        return true;
    }
    private void dfs(int room,List<List<Integer>> rooms,boolean[] v){
        if(v[room]) return;
        v[room]=true;
        for(int k:rooms.get(room)){
            dfs(k,rooms,v);
        }
    }
}