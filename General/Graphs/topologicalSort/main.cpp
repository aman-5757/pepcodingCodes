void dfs_topo(vector<vector<int> > & graph, int src, vector<bool> & vis, vector<int> & ans){
    vis[src] = true;
    
    for(int nbr : graph[src]){
        if(!vis[nbr]){
            dfs_topo(graph, nbr, vis, ans);
        }
    }
    
    ans.push_back(src);
}


vector<int> topoSort(vector<vector<int>> & graph, int N){
    vector<bool> vis(N, false);
    vector<int> ans;
    
    for(int i = 0; i<N; i++){
        if(vis[i] == false){
            dfs_topo(graph, i, vis, ans);
        }
    }
    
    reverse(ans.begin(), ans.end());
    return ans;
}

//=================Another Way  to detect cycle also========================

void dfs_topo(vector<vector<int> > & graph, int src, vector<bool> & vis, vector<int> & ans){
    vis[src] = 1;
    
    for(int nbr : graph[src]){
        if(vis[nbr] == 0){
            dfs_topo(graph, nbr, vis, ans);
        }
        else if( vis[nbr] == 1){
            isCycle = true;
            break;
        }
        else if( vis[nbr] == 2){
            continue;
        }
    }
    vis[src] = 2;
    
    ans.push_back(src);
}


vector<int> topoSort(vector<vector<int>> & graph, int N){
    vector<int> vis(N, 0);
    vector<int> ans;
    
    for(int i = 0; i<N; i++){
        if(vis[i] == 0){
            dfs_topo(graph, i, vis, ans);
        }
    }
    
    reverse(ans.begin(), ans.end());
    return ans;
}