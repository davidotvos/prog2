public class negyzetosszeg {
    public static void main(String[] args) {
        int n = 100;

        System.out.println(sumsquare(n) - squaresum(n));

    }
    static double squaresum(int n){
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + (i * i);
        }
        return sum;
    }

    static double sumsquare(int n){
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum*sum;
    }
}
