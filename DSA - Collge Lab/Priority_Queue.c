#include<stdio.h>
#include<stdlib.h>
#define allocate() (struct Node*)malloc(sizeof(struct Node))

struct Node{
    int val, p;
    struct Node *next;
};

void enqueue(struct Node *queue, int val, int p){
    struct Node *temp = allocate();
    struct Node *temp2;
    p = p ? p : 1;
    temp->val = val;
    temp->p = p;
    temp->next = NULL;
    
    if(queue->next == NULL){
        queue->next = temp;
        return;
    }
    
    if(queue->next->p > p){
        temp->next = queue->next;
        queue->next = temp;
    }
    else{
        temp2 = queue;
        while((temp2->next != NULL) && (temp2->next->p < p)){
            temp2 = temp2->next;
        }
        temp->next = temp2->next;
        temp2->next = temp;
    }
}

void display(struct Node* queue){
    struct Node* temp = queue;
    while(temp->next != NULL){
        printf("%d ", temp->next->val);
        temp = temp->next;
    }
}

int main(){
    int n;
    scanf("%d",&n);
    struct Node *queue = allocate();
    queue->next = NULL;
    
    for(int i=0;i<n;i++){
        int val, p;
        scanf("%d",&val);
        scanf("%d",&p);
        enqueue(queue, val, p);
    }
    
    display(queue);
    
}
