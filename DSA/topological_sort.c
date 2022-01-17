#include<stdio.h>
int arr[25][25] = {};
int visited[25] = {};
int stack[25];
int sIndex = -1;

void sort(int v, int n){
    visited[v] = 1;
    for(int i=n;i>=0;i--){
        if(arr[v][i] && (visited[i] == 0)){
            sort(i, n);
        }
    }
    for(int i=0;i<=sIndex;i++){
        if(stack[i] == v+1) return;
    }
    stack[++sIndex] = v+1;
}

int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    for(int i=0;i<n;i++) sort(i, n);
    printf("The topological order is:\n");
    for(int i=sIndex; i>= 0; i--) printf("%d ", stack[i]);
}
