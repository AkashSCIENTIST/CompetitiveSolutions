// You are using GCC
#include<stdio.h>

typedef struct{
    int arr[25];
    int front, rear, max;
}Queue;

void insert(Queue *q, int val){
    if(q->front == -1){
        q->front++;
    }
    q->rear = (q->rear + 1) % (q->max);
    q->arr[q->rear] = val;
}

int del(Queue *q){
    int n = q->arr[q->front];
    q->front = (q->front + 1) % (q->max);
    return n;
}

int main(){
    int n;
    scanf("%d",&n);
    Queue q;
    q.front = -1;
    q.rear = -1;
    q.max = n;
    
    for(int i=0;i<n;i++){
        int val;
        scanf("%d",&val);
        insert(&q, val);
    }
    printf("%d", del(&q));
}
