import java.util.Scanner;

public class osztalyozas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i= 0; i < num; i++){
            int points = sc.nextInt();
            if(points >= 80){
                System.out.println("jeles");
            }
            else if(points >= 70){
                System.out.println("jo");
            }
            else if(points >= 60){
                System.out.println("kozepes");
            }
            else if(points >=50){
                System.out.println("elegseges");
            }
            else{
                System.out.println("elegtelen");
            }
        }
    }
}
