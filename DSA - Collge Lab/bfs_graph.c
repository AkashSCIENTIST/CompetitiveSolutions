#include<stdio.h>
int arr[50][50] = {};
int visit[50] = {};

void bfs(int n, int v1){
    int v2, v3;
    visit[v1] = 1;
    int front, rear;
    front = rear = -1;
    int q[n];
    q[++rear] = v1;
    while(front != rear){
        v3 = q[++front];
        printf("%d ", v3);
        for(v2 = 0; v2 <= n; v2++){
            if(arr[v3][v2] && !visit[v2]){
                q[++rear] = v2;
                visit[v2] = 1;
            }
        }
    }
}

int main(){
    int n;
    scanf("%d",&n);
    int a,b;
    scanf("%d %d", &a, &b);
    while(a != -1){
        arr[a][b] = 1;
        scanf("%d %d", &a, &b);
    }
    int vrtx;
    scanf("%d",&vrtx);
    bfs(n, vrtx);
}
