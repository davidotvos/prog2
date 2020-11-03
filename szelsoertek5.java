import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class szelsoertek5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //int n = 0;
        //List <Integer> results = new ArrayList<>();
        while (true) {
            String[] t = s.split(" ");

            //ha 0 az elso szam kilep
            if(Integer.parseInt(t[0]) == 0){
                break;
            }
            int[] szamok = new int[t.length];
            for (int i = 0; i < t.length; i++) {
                szamok[i] = Integer.parseInt(t[i]);
            }

            int quantity = szamok[0];
            int min = szamok[1];

            //min szamolas
            for(int i = 1; i <= quantity;i++) {
                if (min > szamok[i]) {
                    min = szamok[i];
                    //System.out.println("-- " + min);
                }
            }
            //results.add(min);
            //n++;
            System.out.println(min);
            s = sc.nextLine();
        }


        /*for(int i = 0; i < n; i++){
            System.out.println(results.get(i));
        }*/
    }
}