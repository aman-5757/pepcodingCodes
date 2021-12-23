#include<iostream>
#include<vector>

using namespace std;

void display(vector<int> & arr){
    for(int ele : arr)
        cout<<ele<<" ";
    cout<<endl;
}

void display2D(vector<vector<int> > & arr){
    for(vector<int> & d : arr){
        display(d);
    }
    cout<<endl;
}

int fibo_memo(int n, vector<int> & dp){
    if(n <= 1)
        return dp[n] = n;
    if(dp[n] != 0)
        return dp[n];
    return dp[n] = fibo_memo(n-1, dp) + fibo_memo(n-2, dp);
}

int fibo_tabu(int N, vector<int> & dp){
    for(int n = 0; n<=N; n++){
        if(n <= 1){
            dp[n] = n;
            continue;
        }
        
        dp[n] = dp[n-1] + dp[n-2]; //fibo_memo(n-1, dp) + fibo_memo(n-2, dp);
    }
    return dp[N];
}

int fibo_opti(int n){
    int a = 0, b = 1;
    for(int i = 2; i<=n; i++){
        int sum = a + b;
        a = b;
        b = sum;
    }
    return b;

}


void fibo(){
    int n = 10;
    vector<int> dp(n+1, 0);
    // cout<<fibo_memo(n,dp)<<endl;
    cout<<fibo_tabu(n,dp)<<endl;

    display(dp);
}

int mazePath_memo(int si,int  sj,int  ei,int  ej,  vector<vector<int> > & dp, vector<vector<int> > & dir ){
    if(si == ei && sj == ej){
        return dp[si][sj] = 1;
    }

    int count = 0;
    for(vector<int> & d : dir){
        int x = si + d[0];
        int y = sj + d[1];

        if(x >= 0 && y >= 0  && x < dp.size() && y < dp[0].size()){
            count += mazePath_memo(x,y,ei, ej, dp, dir);
        }
    }
    return dp[si][sj] = count;
}

int mazePath_tabu(int SI,int  SJ,int  EI,int  EJ,  vector<vector<int> > & dp, vector<vector<int> > & dir ){
    for(int si = EI; si >= 0; si--){
        for(int sj = EJ; sj >= 0; sj--){
            if(si == EI && sj == EJ){
                dp[si][sj] = 1;
                continue;
            }

            int count = 0;
            for(vector<int> & d : dir){
                int x = si + d[0];
                int y = sj + d[1];

                if(x >= 0 && y >= 0  && x < dp.size() && y < dp[0].size()){
                    count += dp[x][y];
                }
            }
            dp[si][sj] = count;
        }
    }
    return dp[SI][SJ];
    
}
int mazePathJump_tabu(int SI,int  SJ,int  EI,int  EJ,  vector<vector<int> > & dp, vector<vector<int> > & dir ){
    for(int si = EI; si >= 0; si--){
        for(int sj = EJ; sj >= 0; sj--){
            if(si == EI && sj == EJ){
                dp[si][sj] = 1;
                continue;
            }

            int count = 0;
            for(vector<int> & d : dir){
                int x = si + d[0];
                int y = sj + d[1];

                while(x >= 0 && y >= 0  && x < dp.size() && y < dp[0].size()){
                    count += dp[x][y];
                    x += d[0];
                    y += d[1];
                }
            }
            dp[si][sj] = count;
        }
    }
    return dp[SI][SJ];
    
}


void mazePath(){
    vector<vector<int> > dir = {{1,0}, {0,1} ,{1,1}};
    int si = 0, sj = 0, ei = 3, ej = 3;
    vector<vector<int> > dp(ei + 1, vector<int>(ej + 1, 0));
    // cout<<mazePath_memo(si, sj, ei, ej, dp, dir)<<endl;
    // cout<<mazePath_tabu(si, sj, ei, ej, dp, dir)<<endl;
    cout<<mazePathJump_tabu(si, sj, ei, ej, dp, dir)<<endl;
    display2D(dp);
}

//leetcode 62: Uniqe Paths
//leetcode 63: Uniqe Paths II
int mazePath_obstacle(vector<vector<int> > & obstacleGrid, int SI,int  SJ,int  EI,int  EJ,  vector<vector<int> > & dp, vector<vector<int> > & dir ){
    for(int si = EI; si >= 0; si--){
        for(int sj = EJ; sj >= 0; sj--){
            if(si == EI && sj == EJ){
                dp[si][sj] = 1;
                continue;
            }

            int count = 0;
            for(vector<int> & d : dir){
                int x = si + d[0];
                int y = sj + d[1];

                if(x >= 0 && y >= 0  && x < dp.size() && y < dp[0].size() && obstacleGrid[x][y] == 0){
                    count += dp[x][y];
                }
            }
            dp[si][sj] = count;
        }
    }
    return dp[SI][SJ];
    
}
int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
    int n = obstacleGrid.size();
    int m = obstacleGrid[0].size();
    int si = 0, sj = 0, ei = n-1, ej = m-1;
    vector<vector<int> >dp(n,vector<int>(m,0));
    vector<vector<int> > dir = {{1,0}, {0,1}};
    return mazePath_obstacle(obstacleGrid, si, sj, ei, ej, dp, dir);
}


//leetcode 70: Climbing Stairs
//leetcode 746: Min. Cost Climbing Stairs
int minCostClimbingStairs(vector<int>& cost) {
        int n = cost.size();
        vector<int> dp(n, 0);
        for(int i = 0; i<n; i++){
            if(i <= 1)
            {
                dp[i] = cost[i];
                continue;
            }
            int myans =min( dp[i-1] , dp[i-2] )+ cost[i];
            dp[i] = myans;
        }
        return min(dp[n-1], dp[n-2]);
}

//boardPath: dice(6 moves)
int boardPath_memo(int sp, int ep, vector<int> & dp){
    if(sp == ep){
        return dp[sp] = 1;
    }
    if(dp[sp] != 0)
        return dp[sp];
    int count = 0;

    for(int dice = 1; dice<=6 && dice + sp <= ep; dice++){
        count += boardPath_memo(sp + dice, ep, dp);
    }
    return dp[sp] = count;
}

int boardPath_tabu(int SP, int ep, vector<int> & dp){
    for(int sp = ep; sp>=0; sp--){
        if(sp == ep){
           dp[sp] = 1;
           continue;
        }
        int count = 0;

        for(int dice = 1; dice<=6 && dice + sp <= ep; dice++){
            count += dp[sp+dice]; //boardPath_memo(sp + dice, ep, dp);
        }
        dp[sp] = count;
    }
    return dp[SP];
    
}

//leetcode 91: Decode Ways
int numDecodings(string s , int idx, vector<int> & dp){
    if(idx == s.length()){
        return dp[idx] = 1;
    }

    if(dp[idx] != -1){
        return dp[idx];
    }

    char ch = s[idx];

    if(ch == '0'){
        return dp[idx] = 0; 
    }

    int count = numDecodings(s, idx+1 ,dp);

    if(idx < s.length()-1){
        char ch1 = s[idx+1];
        int num = (ch-'0') * 10 + (ch1 - '0');
        if(num<=26){
            count += numDecodings(s, idx+ 2, dp);
        }
    }
    return dp[idx] = count;
}

int numDecodings_tabu(string s , int IDX, vector<int> & dp){
    for(int idx = dp.size()-1; idx >=0 ; idx--){
        if(idx == s.length()){
            dp[idx] = 1;
            continue;
        }

       

        char ch = s[idx];

        if(ch == '0'){
            dp[idx] = 0; 
            continue;
        }

        int count = dp[idx+1]; //numDecodings(s, idx+1 ,dp);

        if(idx < s.length()-1){
            char ch1 = s[idx+1];
            int num = (ch-'0') * 10 + (ch1 - '0');
            if(num<=26){
                count += dp[idx+2];//numDecodings(s, idx+ 2, dp);
            }
        }
        dp[idx] = count;
    }
    return dp[IDX];
    
}

int numDecodings(string s){
    int n = s.length();
    vector<int> dp(n+1, -1);
    int ans = numDecodings(s, 0, dp);
    display(dp);
    return ans;
}

int main(){
    // fibo();
    // mazePath();
    
    return 0;
}

