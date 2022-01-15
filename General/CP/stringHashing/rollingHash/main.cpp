#include<bits/stdc++.h>

#define lli long long int
#define ii pair<int, int>
#define vi vector<int>
#define vii vector<ii>
#define mod 1000000007

using namespace std;

lli getHash(string key){
    lli hash = 0;
    lli p = 31;
    lli p_power = 1;

    for(char ch : key){
        hash = (hash + (ch - 'a' + 1) * p_power) % mod;
        p_power = (p_power * p) % mod;
    }

    return hash;
}

int main(){
    bool flag = 1;
    while(flag){
        string key;
        cout<<"\n-> Enter Key \n";
        cin>>key;
        if(key == "."){
            flag = false;
        }
        else{
            cout<<"Key : " <<key<<"  || Hash Value: "<<getHash(key);
        }
    }

    return 0;
}