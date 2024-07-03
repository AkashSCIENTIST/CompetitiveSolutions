#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n,x,y;
    set<int> s;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> y >> x;
        
        if(y == 1){
            s.insert(x);
        }
        else if(y == 2){
            s.erase(x);
        }
        else{
            set<int>::iterator itr = s.find(x);
            if(itr == s.end()) cout << "No\n";
            else cout << "Yes\n";
        }
    }
    
      
    return 0;
}



