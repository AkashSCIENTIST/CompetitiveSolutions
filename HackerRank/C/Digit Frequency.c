#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include<ctype.h>

int main() {

    char ptr[999];
    int arr[10] = {};
    scanf("%[^\n]s",&ptr);
    int i=0;
    while(ptr[i] != '\0'){
        if((ptr[i] >='0')&&(ptr[i] <= '9')){
            arr[ptr[i] - '0']++;
        }
        i++;
    }
    for(int i=0;i<10;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}
