public class Test {
    public static void main(String[] args) {
        Thread lazy = new LazyPrimeFactorization();
        Thread optimized = new OptimizedPrimeFactorization();

        lazy.start();
        optimized.start();
    }
}
