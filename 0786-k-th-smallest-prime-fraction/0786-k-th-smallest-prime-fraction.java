class Pair{
    double div;
    int a;
    int b;

    Pair(double div, int a, int b){
        this.div = div;
        this.a = a;
        this.b = b;
    }
}
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> Double.compare(y.div, x.div));

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double div = (double)arr[i]/(double)arr[j];
                pq.add(new Pair(div, arr[i], arr[j]));

                if(pq.size()>k) pq.remove();
            }
        }

        Pair peek = pq.remove();
        return new int[]{peek.a, peek.b};
    }
}