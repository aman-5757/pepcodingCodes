//ackermann function for Time Complexity

#include<vector>
#include<iostream>
using namespace std;


vector<int> parent;
vector<int> size;

int findPar(int u){
    if(parent[u] == u)
        return u;
    return parent[u] = findPar(parent[u]);
}

void merge(int p1, int p2){
    if(size[p1]<size[p2]){
        parent[p1] = p2;
        size[p2] += size[p1];
    }
    else{
        parent[p2] = p1;
        size[p1] += size[p2];
    }
}

// vector<vector<int> > is that graph which has no cycle

vector<vector<int> > union_find(int n, vector<vector<int> > & edges){
    parent.resize(n,0);
    size.resize(n,0);
    vector<vector<int> > ans(n);

    for(int i = 0 ; i<n; i++){
        parent[i] = i;
        size[i] = 1;
    }

    for(vector<int> & edge : edges){
        int u = edge[0];
        int v = edge[1];

        int p1 = findPar(u);
        int p2 = findPar(v);
        if(p1 != p2){
            merge(p1,p2);
            ans[u].push_back(v);
            ans[v].push_back(u);
        }
    }
    return ans;
}

int main(){
    // n is number of vtx
    int n = 9;
    vector<vector<int> > edges = {{0,1}, {0,7}, {2,5}, {2,3}, {2,8}, {7,6}, {6,5}, {3,4} };
    vector<vector<int> > ans = union_find(n, edges);
    return 0;
}