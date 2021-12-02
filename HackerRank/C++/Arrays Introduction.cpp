#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin >> n;
    int arr[n];
    int temp;
    for(int i=0;i<n;i++)  {
        cin >> temp;
        arr[i] = temp;
        //cout << temp;
    }
    for(int i = n-1; i >= 0; i--){
        cout << arr[i] << " ";
    }
    return 0;
}
