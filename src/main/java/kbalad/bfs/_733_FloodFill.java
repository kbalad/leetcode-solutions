package kbalad.bfs;

public class _733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initColor = image[sr][sc];
        if (initColor != color) dfs(image, sr, sc, initColor, color);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int initColor, int newColor) {
        if (image[r][c] == initColor) {
            image[r][c] = newColor;
            if (r > 0) dfs(image, r - 1, c, initColor, newColor);
            if (r < image.length - 1) dfs(image, r + 1, c, initColor, newColor);
            if (c > 0) dfs(image, r, c - 1, initColor, newColor);
            if (c < image[0].length - 1) dfs(image, r, c + 1, initColor, newColor);
        }
    }
}
