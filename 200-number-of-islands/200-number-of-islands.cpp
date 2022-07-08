using namespace std;
class Solution {
public:
    int height;
    int width;

    int numIslands(vector<vector<char>>& grid) {
        height = grid.size();
        width = grid[0].size();
        int sum = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == '1') {
                    search(grid, i, j);
                    sum++;
                }
            }
        }
        
        return sum;
    }
    
    int search(vector<vector<char>>& grid, int i, int j) {
        queue<pair<int, int>> q;
        q.push({i , j});
        
        while (q.size() != 0) {
            auto point = q.front();
            q.pop();
            int row = point.first;
            int col = point.second;
            
            if (row - 1 >= 0 && grid[row - 1][col] == '1') {
                grid[row - 1][col] = '0';
                q.push({ row - 1, col });
            }
            if (row + 1 < height && grid[row + 1][col] == '1') {
                grid[row + 1][col] = '0';
                q.push({ row + 1, col });
            }
            if (col - 1 >= 0 && grid[row][col - 1] == '1') {
                grid[row][col - 1] = '0';
                q.push({ row, col - 1 });
            }
            if (col + 1 < width && grid[row][col + 1] == '1') {
                grid[row][col + 1] = '0';
                q.push({ row, col + 1 });
            }
        }
        return 0;
    }
};