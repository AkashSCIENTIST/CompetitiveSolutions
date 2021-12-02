#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    vector<int> v;
    int n, t,tt;
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> t;
        v.push_back(t);
    }
    cin >> t;
    v.erase(v.begin()+t-1);
    cin >> tt >> t;
    v.erase(v.begin()+tt-1,v.begin()+t-1);
    cout << v.size() << "\n";
        for(int i=0; i<v.size(); i++){
        cout << v[i] << " ";
    }
    return 0;
}
