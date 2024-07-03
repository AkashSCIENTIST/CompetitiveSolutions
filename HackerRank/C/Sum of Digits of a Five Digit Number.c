#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n;
    scanf("%d", &n);
    int temp = 0;
    while(n){
        temp += n%10;
        n/= 10;
    }
    printf("%d",temp);
    return 0;
}
