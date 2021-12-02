

//Write your code here

class Arithmetic{
    public int add(int a, int b){
        int sum = a + b; 
        return sum;
    }
}

class Adder extends Arithmetic{  
    public int callAdd(int a, int b){
        return add(a, b);
    }
}

