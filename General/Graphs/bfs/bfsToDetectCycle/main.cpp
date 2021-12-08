/*
It is like simple bfs just use visited along with graph
Jab remove kr rhe hai!, tab chcek krlo ki ye rem phle se visited hai ya nahi.. If yes then there is cycle

*** We check cycle mainly for Directed Graph
*/

#include<iostream>
#include<queue>
#include<vector>
using namespace std;

void bfs(vector<vector <int>> & graph, int src){
    int level = 0;
    queue<int> qu;
    qu.push(src);
    bool isCycle = false;
    while(qu.size() != 0){
        int s = qu.size();
        while(s-- > 0){
            int rem = qu.front();
            qu.pop();

            if(vis[rem] == true){
                isCycle = true;
                break;
            }

            vis[rem] = true;
            for(int nbr : graph[src]){
                qu.push(nbr);
            }
            level++;
        }
    }
}

int main(){

}