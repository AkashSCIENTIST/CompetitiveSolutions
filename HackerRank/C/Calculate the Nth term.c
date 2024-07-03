#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.

int find(int n, int a, int b, int c) {
  if(n == 1)
  return a;
  else if(n ==2)
  return b;
  else if(n==3)
  return c;
  else
  return find(n-3, a, b,c ) + find(n-2,a,b,c) + find(n-1,a,b,c);
}

int main() {
    int n, a, b, c;
  
    scanf("%d %d %d %d", &n, &a, &b, &c);
    int ans = find(n, a, b, c);
 
    printf("%d", ans); 
    return 0;
}
