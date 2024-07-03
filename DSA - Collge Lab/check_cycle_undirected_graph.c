#include<stdio.h>
int arr[25][25] = {};
int visit[25] = {};
int n;

int detectCycle(int vrtx, int p){
    visit[vrtx] = 1;
    int status = 0;
    for(int i=0;i<n;i++){
        if(arr[vrtx][i]){
            if((i==p) || (i==vrtx)) continue;
            else if(visit[i] == 1) return 1;
            else status |= detectCycle(i, vrtx);
        }
    }
    return status;
}

int main(){
    scanf("%d",&n);
    int a,b,c,vrtx;
    scanf("%d",&a);
    for(int i=0;i<a;i++){
        scanf("%d",&b);
        scanf("%d",&c);
        arr[b][c] = 1;
        arr[c][b] = 1;
        printf("%d %d\n", b, c);
        if(i == 0) vrtx = b;
    }
    if(detectCycle(vrtx, -1)){
        printf("Graph contains cycle");
    }
    else{
        printf("Graph doesn't contains cycle");
    }
}
