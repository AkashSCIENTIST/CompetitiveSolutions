#include<stdio.h>
#include<stdlib.h>
#define allocate() (struct Node*)malloc(sizeof(struct Node))

struct Node{
	int data;
	struct Node *left, *right;
};

struct Node* Node(int data){
    struct Node* temp = allocate();
    temp->right = temp->left = NULL;
    temp->data = data;
    return data;
}

void insertBST(struct Node* tree, int val){
	
	if(tree->data > val){
		if(tree->left != NULL){
			insertBST(tree->left, val);
		}
		else{
			tree->left = allocate();
			tree->left->left = NULL;
			tree->left->right = NULL;
			tree->left->data = val;
		}
		
	}
	else if(tree->data < val){
		if(tree->right != NULL){
			insertBST(tree->right, val);
		}
		else{
			tree->right = allocate();
			tree->right->left = NULL;
			tree->right->right = NULL;
			tree->right->data = val;
		}
		
	}
	else if(tree->data == val){
	    return;
	}
}

void preOrderPrint(struct Node* tree){
	if(tree != NULL){
		printf("%d ", tree->data);
		preOrderPrint(tree->left);
		preOrderPrint(tree->right);
	}
}

void postOrderPrint(struct Node* tree){
	if(tree != NULL){
		postOrderPrint(tree->left);
		postOrderPrint(tree->right);
		printf("%d ", tree->data);
	}
}

void inOrderPrint(struct Node* tree){
	if(tree != NULL){
		inOrderPrint(tree->left);
		printf("%d ", tree->data);
		inOrderPrint(tree->right);
	}
}

int min(struct Node* tree){
	if(tree->left == NULL){
		return tree->data;
	}
	else{
		return min(tree->left);
	}
}

int max(struct Node* tree){
	if(tree->right == NULL){
		return tree->data;
	}
	else{
		return max(tree->right);
	}
}

int search(struct Node* tree, int val){
	if(tree == NULL) return 0;
	else if(tree->data == val) return 1;
	else if(tree->data > val) return search(tree->left, val);
	else if(tree->data < val) return search(tree->right, val);
	else return 0;
}

struct Node* findMaxNode(struct Node* tree){
	struct Node* node = tree;
	while(node && node->right){
		node = node->right;
	}
	return node;
}

struct Node* findMinNode(struct Node* tree){
	struct Node* node = tree;
	while(node && node->left){
		node = node->left;
	}
	return node;
}
struct Node* delBST(struct Node* tree, int val){
	
	if(tree == NULL) return tree;
	if(val < tree->data) tree->left = delBST(tree->left, val);
	else if(val > tree->data) tree->right = delBST(tree->right, val);
	
	else if(tree->left && tree->right){
		struct Node* temp_tree = findMaxNode(tree->left);
		tree->data = temp_tree->data;
		delBST(tree->left, tree->data);
	}
	
    else{
      if (tree->left == NULL){
         struct Node *temp = tree->right;
         free(tree);
         return temp;
      }
      else if (tree->right == NULL){
         struct Node *temp = tree->left;
         free(tree);
         return temp;
      }
      struct Node* temp = findMinNode(tree->right);
      tree->data = temp->data;
      tree->right = delBST(tree->right, temp->data);
   }
   return tree;
}
