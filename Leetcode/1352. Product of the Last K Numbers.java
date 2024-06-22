class ProductOfNumbers {
    List<Integer> arr;

    public ProductOfNumbers() {
        arr = new ArrayList<Integer>(40000);
        arr.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            arr.clear();
            arr.add(1);
        }
        else arr.add(arr.get(arr.size() - 1) * num);
    }
    
    public int getProduct(int k) {
        int n = arr.size();
        if(k >= n) return 0;
        else return arr.get(n-1)/arr.get(n-k-1);
    }
}
