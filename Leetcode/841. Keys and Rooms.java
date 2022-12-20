class Solution {
    TreeSet<Integer> visited;
    int n;
    List<List<Integer>> rooms_;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        n = rooms.size();
        rooms_ = rooms;
        visited = new TreeSet<Integer>();
        fun(0);
        return visited.size() == n;
    }
    public void fun(int i){
        if(visited.contains(i)) return;
        visited.add(i);
        Iterator value = rooms_.get(i).iterator();
        while(value.hasNext()){
            fun((int)value.next());
        }
    }
}
