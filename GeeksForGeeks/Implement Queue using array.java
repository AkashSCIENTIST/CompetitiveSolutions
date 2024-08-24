class MyQueue {

    int front, rear;
	int arr[] = new int[100005];
	int size = 100005;

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    if((rear+1)%size == front%size) return;
	    arr[rear++] = x;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(rear == 0) return -1;
		int ans = arr[front++];
		if(front == rear) {
		    front = 0;
		    rear = 0;
		}
		return ans;
	} 
}
