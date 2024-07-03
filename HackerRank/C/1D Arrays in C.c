#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
int n;
int sum = 0;
int temp;
scanf("%d", &n);
for(int i=0;i<n;i++){
    scanf("%d",&temp);
    sum += temp;
}
printf("%d",sum);
}
