class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int fistRectArea = Math.abs((ax2 - ax1) * (ay2 - ay1));
        int secondRectArea = Math.abs((bx2 - bx1) * (by2 - by1));

        int commonX = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        if (commonX < 0) {
            commonX = 0;
        }
             
        int commonY = Math.min(ay2, by2) - Math.max(ay1, by1);
        if (commonY < 0) {
            commonY = 0;
        }        
        
        return fistRectArea + secondRectArea - commonX * commonY;
    }
}
