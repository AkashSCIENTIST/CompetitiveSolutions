#include<stdio.h>

int min(int x, int y){
    return (x<=y ? x : y);
}


int main(){
    int n;
    scanf("%d",&n);
    
    int arr[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    for(int k=0;k<n;k++){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = min(arr[i][j], arr[i][k] + arr[k][j]);
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j] == 999) printf("INF ");
            else printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}
