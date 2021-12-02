#include <stdio.h>

void update(int *a,int *b) {
    int x = *a;
    int y = *b;
    int c = x + y;
    int d = ((x-y)>0)  ? (x-y) : (y-x);
    *a = c;
    *b = d;
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
