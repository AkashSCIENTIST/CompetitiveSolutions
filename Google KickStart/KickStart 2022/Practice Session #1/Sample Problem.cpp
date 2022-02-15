#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;
    for(int i=1;i<=n;i++){
        int x, y, temp, left;
        cin >> x >> y;
        int total = 0;
        for(int j=0;j<x;j++){
            cin >> temp;
            total += temp;
        }
        left = total % y;
        cout << "Case #" << i << ": " << left << endl;
    }
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    solve();
    return 0;
}
