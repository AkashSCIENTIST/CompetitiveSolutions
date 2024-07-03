#include<stdio.h>
int arr[25][25] = {};
int v[25] = {};

int min(int x, int y){
    return (x<=y ? x : y);
}

void dfs(int n, int i){
    if(v[i] == 1) return;
    else{
        printf("%d ", i);
        v[i] = 1;
        for(int u=0;u<n;u++){
            if(arr[i][u]){
                dfs(n, u);
            }
        }
    }
}

int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    int vrtx;
    scanf("%d",&vrtx);
    dfs(n, vrtx);
}
