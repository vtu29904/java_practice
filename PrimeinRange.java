public class PrimeinRange {
    public static void main(String[] args) {
        for(int n=10;n<100;n++){
            boolean isPrime = CheckforPrime(n);
            if(isPrime == true){
                System.out.println("Prime"+n);
            }
        }
    }
    static boolean CheckforPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
