class Solution {
public:
    int countServers(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();

        vector<vector<int> > edges;

        for(int i = 0; i<n; i++ ){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == 1){
                    edges[i].push_back(j);
                    edges[j].push_back(i);

                }
            }
        }
    }
};