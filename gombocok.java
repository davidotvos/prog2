import java.util.Scanner;

public class gombocok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int price = Integer.parseInt(s);
        int allcost = 0;

        while(sc.hasNextLine()){
            s = sc.nextLine();
            String[] t = s.split(":");
            allcost += price * Integer.parseInt(t[1]);
        }
        System.out.println(allcost);
    }
}
