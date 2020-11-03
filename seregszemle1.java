import java.util.Scanner;

public class seregszemle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
                    if(number > 0 && number%2 == 0){
                        k++;
                    }
        }
        System.out.println(k);
    }
}
