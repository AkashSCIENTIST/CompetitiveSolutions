#include <iostream>
#include <cstdio>
using namespace std;

int max_of_four(int a, int b, int c, int d){
    int n;
    if(a >= b){
        n = a;
    }
    else{
        n = b;
    }
    if(c >= n){
        n = c;
    }
    if(d >= n){
        n = d;
    }
    return n;
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}
