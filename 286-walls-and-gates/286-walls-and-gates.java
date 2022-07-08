class Solution {
    private static final int INF = 2147483647;
    
    public void wallsAndGates(int[][] rooms) { 
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                if (rooms[i][j] == 0) {
                    q.add(new int[] { i, j});
                }
            }
        }
        search(rooms, q);
    }
    
    private void search(int[][] rooms, Queue<int[]> q) {
        int height = rooms.length;
        int width = rooms[0].length;
        
        while (!q.isEmpty()) {
            int[] room = q.poll();
            int row = room[0];
            int col = room[1];
            if (row - 1 >= 0 && rooms[row - 1][col] == INF) {
                rooms[row - 1][col] = rooms[row][col] + 1;
                q.add(new int[] { row - 1, col });
            }
            if (row + 1 < height && rooms[row + 1][col] == INF) {
                rooms[row + 1][col] = rooms[row][col] + 1;
                q.add(new int[] { row + 1, col });
            }
            if (col - 1 >= 0 && rooms[row][col - 1] == INF) {
                rooms[row][col - 1] = rooms[row][col] + 1;
                q.add(new int[] { row, col - 1 });
            }
            if (col + 1 < width && rooms[row][col + 1] == INF) {
                rooms[row][col + 1] = rooms[row][col] + 1;
                q.add(new int[] { row, col + 1 });
            }
        }
    }
}