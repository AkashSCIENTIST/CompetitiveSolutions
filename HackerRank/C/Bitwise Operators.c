#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
  int a=0,b=0,c=0;
  int max_a =0,max_b = 0,max_c = 0;
  for(int i=1;i<n;i++){
      for(int j=i+1;j<=n;j++){
          
          a = i & j;
          if ((a < k) && (a > max_a)){
              max_a = a;
          }

          b = i | j;
          if ((b < k) && (b > max_b)){
              max_b = b;
          }
          
          c = i ^ j;
          if ((c < k) && (c > max_c)){
              max_c = c;
          }
          
      }
  }
  printf("%d\n%d\n%d",max_a,max_b,max_c);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
