package BaiTap.Bai3;

public class Main {
    public static  int numLimited=100;
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization=new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization=new OptimizedPrimeFactorization();

        Thread lpf=new Thread(lazyPrimeFactorization,"lazyPrimeFactorization");
        Thread Opf=new Thread(optimizedPrimeFactorization,"optimizedPrimeFactorization");
        lpf.start();
        Opf.start();
    }
}
