#include<stdio.h>
int arr[25][25] = {};
int visit[25] = {};
int n;

int isOddCycle(int vrtx, int p){
    visit[vrtx] = 1;
    int status = 0;
    for(int i=0;i<n;i++){
        if(arr[vrtx][i]){
            if((i==p) || (i==vrtx)) continue;
            else if(visit[i] == 1) return 1;
            else status |= isOddCycle(i, vrtx);
        }
    }
    return status;
}

int main(){
    int n2, vrtx;
    scanf("%d",&n);
    scanf("%d",&n2);
    int sum = 0;
    printf("%d %d\n", n, n2);
    for(int i=0;i<n2;i++){
        int a,b,c;
        scanf("%d %d %d", &a, &b, &c);
        printf("%d %d %d\n", a, b, c);
        if(i == 0) vrtx = a;
        arr[a][b] = c;
        arr[b][a] = c;
        sum += c;
    }
    if(isOddCycle(vrtx, -1) && sum%2) printf("Yes");
    else printf("No");
}
