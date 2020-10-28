public class OptimizedPrimeFactorization extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(this.isPrime(i)){
                System.out.println("o"+i);
            }
        }
    }

    public boolean isPrime(int number){
        if(number < 2){
            return false;
        }else if(number == 2){
            return true;
        }else{
            for (int i = 2; i < Math.sqrt(number); i++) {
                if(number % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
