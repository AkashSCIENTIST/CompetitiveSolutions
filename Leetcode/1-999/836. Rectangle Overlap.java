
//runtime : 0ms

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int ax1, ax2, ay1, ay2, bx1, bx2, by1, by2;
        
        ax1 = rec1[0];
        ay1 = rec1[1];
        ax2 = rec1[2];
        ay2 = rec1[3];
        
        bx1 = rec2[0];
        by1 = rec2[1];
        bx2 = rec2[2];
        by2 = rec2[3];
        
        
        boolean commonX = Math.min(ax2, bx2) > Math.max(ax1, bx1);
        boolean commonY = Math.min(ay2, by2) > Math.max(ay1, by1);      
        
        return commonX && commonY;
    }
}
