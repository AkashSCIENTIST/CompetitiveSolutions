#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    
    for(int i=0;i<n;i++){
        scanf("%d",&arr[n-i-1]);
    }
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}
