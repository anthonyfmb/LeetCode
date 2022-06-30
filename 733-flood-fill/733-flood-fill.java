class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        floodFillHelper(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    private void floodFillHelper(int[][] image, int sr, int sc, int color, int originalColor) {
        if (sr < 0 || sr > image.length - 1 || sc < 0 || sc > image[0].length - 1 || image[sr][sc] == color || image[sr][sc] != originalColor) {
            return;
        }
        image[sr][sc] = color;
        floodFillHelper(image, sr - 1, sc, color, originalColor);
        floodFillHelper(image, sr + 1, sc, color, originalColor);
        floodFillHelper(image, sr, sc - 1, color, originalColor);
        floodFillHelper(image, sr, sc + 1, color, originalColor);
    }
}