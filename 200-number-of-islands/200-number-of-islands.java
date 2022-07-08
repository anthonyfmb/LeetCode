class Solution {
    public int numIslands(char[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    Queue<int[]> q = new LinkedList<>();
                    int height = grid.length;
                    int width = grid[0].length;
                    q.add(new int[] { i, j });

                    while (!q.isEmpty()) {
                        int[] point = q.poll();
                        int row = point[0];
                        int col = point[1];

                        if (row - 1 >= 0 && grid[row - 1][col] == '1') {
                            grid[row - 1][col] = '0';
                            q.add(new int[] { row - 1, col });
                        }
                        if (row + 1 < height && grid[row + 1][col] == '1') {
                            grid[row + 1][col] = '0';
                            q.add(new int[] { row + 1, col });
                        }
                        if (col - 1 >= 0 && grid[row][col - 1] == '1') {
                            grid[row][col - 1] = '0';
                            q.add(new int[] { row, col - 1 });
                        }
                        if (col + 1 < width && grid[row][col + 1] == '1') {
                            grid[row][col + 1] = '0';
                            q.add(new int[] { row, col + 1 });
                        }
                    }
                    sum++;
                }
            }
        }
        
        return sum;
    }
}