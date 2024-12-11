class Solution {
    public int maxPoints(int[][] points) {
        if(points.length == 1) return 1;
        int n = points.length;
        int out = 1;
        int dy, dx;

        for (int i = 0; i < n; i++) {
            int x = points[i][0], y = points[i][1];
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                int x1 = points[j][0], y1 = points[j][1];
                dy = y1 - y;
                dx = x1 - x;
                int g = gcd(dy, dx);
                dy = dy / g;
                dx = dx / g;
                String key = dy + "." + dx;
                

                map.put(key, map.getOrDefault(key, 0)+1);
                out = Math.max(out, map.get(key)+1);
            }
        }

        return out;
    }

    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
