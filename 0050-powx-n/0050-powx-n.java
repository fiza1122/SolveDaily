class Solution {
    // public double myPow(double x, int n) {
    //    return Math.pow(x,n);  
     public double myPow(double x, int n) {
        if(n<0) return util(1/x, Math.abs((long)n));
        else return util(x, n);    
    }

    private double util(double x, long n) {
        if(n==0) return 1.0;
        if(x==0) return 0.0;
        
        if(n%2==0) {
            return util(x*x, n/2);
        }else {
            return x*util(x, n-1);
        }
    }
}