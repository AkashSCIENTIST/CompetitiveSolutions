#include <stdio.h>

void print(int arr[], int n){
    for(int i=0;i<n;i++){
        printf("%d ", arr[i]);
    }
    printf("\n");
}

void bubbleSort(int arr[], int n){
    for(int i=0;i<n;i++){
        for(int j=i;j<n-1;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

void selectionSort(int arr[], int n){
    int minVal, minIndex;
    for(int i=0;i<n;i++){
        minVal = arr[i];
        minIndex = i;
        for(int j=i;j<n;j++){
            if(arr[j] < minVal){
                minVal = arr[j];
                minIndex = j;
            }
        }
        arr[minIndex] = arr[i];
        arr[i] = minVal;
    }
}

void insertionSort(int arr[], int n){
    int k, j;
    int temp;
    for(k = 1; k < n; k++){
        temp = arr[k];
        j = k-1;
        while((j >= 0) && (arr[j] > temp)){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
    }
}

void merge(int arr[], int left, int mid, int right){
    int n1 = mid - left + 1;
    int n2 = right - mid;
    int L[n1], R[n2];
    int i, j, k;
    
    for(i=0;i<n1;i++) L[i] = arr[left + i];
    for(j=0;j<n2;j++) R[j] = arr[mid + j + 1];
    i = 0; j = 0; k = left;
    
    while((i < n1) && (j < n2)){
        if(L[i] <= R[j]) arr[k++] = L[i++];
        else arr[k++] = R[j++];
    }
    
    while(i < n1) arr[k++] = L[i++];
    while(j < n2) arr[k++] = R[j++];
}

void mergeSort(int arr[], int left, int right){
    if(left >= right) return;
    else{
        int middle = left + (right - left)/2;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle+1, right);
        merge(arr, left, middle, right);
    }
}

int partition(int arr[], int l, int h){
    int pivotPoint = arr[h];
    int i = (l-1);
    for(int j=l;j<h;j++){
        if(arr[j] < pivotPoint){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp2 = arr[i+1];
    arr[i+1] = arr[h];
    arr[h] = temp2;
    return i+1;
}

void quickSort(int arr[], int l, int h){
    if(l < h){
        int temp = partition(arr, l, h);
        quickSort(arr, l, temp-1);
        quickSort(arr, temp+1, h);
    }
}

void shellSort(int arr[], int n){
    for(int gap = n/2; gap > 0; gap /= 2){
        for(int i=gap; i<n;i++){
            int temp = arr[i];
            int j;
            for(j = i; (j >= gap) && (arr[j-gap] > temp); j -= gap) arr[j] = arr[j - gap];
            arr[j] = temp;
        }
    }
}

int getMax(int arr[], int n){
    int mx = arr[0];
    for(int i = 1; i < n; i++) if (arr[i] > mx) mx = arr[i];
    return mx;
}

void countSort(int arr[], int n, int exp){
    int output[n];
    int i, count[10] = {};
 
    for (i = 0; i < n; i++) count[(arr[i] / exp) % 10]++;
    for (i = 1; i < 10; i++) count[i] += count[i - 1];
    for (i = n - 1; i >= 0; i--) {
        output[count[(arr[i] / exp) % 10] - 1] = arr[i];
        count[(arr[i] / exp) % 10]--;
    }
    for (i = 0; i < n; i++) arr[i] = output[i];
}

void radixSort(int arr[], int n){
    int m = getMax(arr, n);
    for (int exp = 1; m / exp > 0; exp *= 10) countSort(arr, n, exp);
}

int binarySearch(int arr[], int l, int r, int key){
    if(r >= l){
        int mid = l + (r - l)/2;
        if(arr[mid] == key) return mid;
        if(arr[mid] > key) return binarySearch(arr, l, mid-1, key);
        else return binarySearch(arr, mid+1, r, key);
    }
    return -1;
}

int main(){
    int arr[5] = {4,5,3,7,1};
    int n = 5;
    //selectionSort(arr, 5);
    //insertionSort(arr, 5);
    //mergeSort(arr, 0, n-1);
    //quickSort(arr, 0, n-1);
    //shellSort(arr, n);
    radixSort(arr, n);
    print(arr, n);
    //binarySearch(arr, 0, n-1, 5);
    return 0;
}
