#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	
    int a,b;
    float c,d;
    scanf("%d%d\n",&a,&b);
    scanf("%f%f\n",&c,&d);
    printf("%d %d\n",a+b,a-b);
    printf("%.1f %.1f",c+d,c-d);
    return 0;
}
