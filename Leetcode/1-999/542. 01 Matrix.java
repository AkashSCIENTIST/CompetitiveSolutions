class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] dirs = {{-1,0}, {1,0}, {0,1}, {0,-1}};
        Queue<Pair<Integer, Integer>> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[rows][cols];
        int[][] ans = new int[rows][cols];


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                if(mat[i][j] == 0) {
                    visited[i][j] = true;
                    q.offer(new Pair<>(i, j));
                }
            }
        }

        while(!q.isEmpty()) {
            int i = q.peek().getKey();
            int j = q.poll().getValue();

            for(int[] dir : dirs) {
                int x = i + dir[0];
                int y = j + dir[1];

                if(x < 0 || x >= rows || y < 0 || y >= cols) continue;
                if(visited[x][y]) continue;

                ans[x][y] = ans[i][j] + 1;
                q.offer(new Pair<>(x,y));
                visited[x][y] = true;
            }
        }

        return ans;
    }
}
