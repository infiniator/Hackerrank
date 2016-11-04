#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int t;
    cin>>t;
    string s[t];
    for(int i = 0; i < t; i++) {
        cin >> s[i];
        if(next_permutation(s[i].begin(), s[i].end()) == 0)
            cout<<"no answer"<<endl;
        else
            cout<<s[i]<<endl;
    }
    return 0;
}