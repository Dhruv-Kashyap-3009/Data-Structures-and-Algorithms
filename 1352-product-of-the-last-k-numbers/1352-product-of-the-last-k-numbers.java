class ProductOfNumbers {
    int[] arr;
    int idx;
    public ProductOfNumbers() {
        arr = new int[40005];
        idx = 0;
    }
    
    public void add(int num) {
        arr[idx++] = num;
    }
    
    public int getProduct(int k) {
        int i = idx-1;
        int pro = 1;

        while(k-- > 0) pro = pro * arr[i--];

        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */