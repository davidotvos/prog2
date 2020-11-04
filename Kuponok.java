import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kuponok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Termekek1> list1 = new ArrayList<>();
        List<Termekek2> list2 = new ArrayList<>();
        String[] data;
        for(int i = 0; i < n; i++){
            data = sc.nextLine().split(";");
            list1.add(new Termekek1(data[0],data[1],Integer.parseInt(data[2])));
            list2.add(new Termekek2(data[0],data[1],Integer.parseInt(data[2])));
        }
        Collections.sort(list1);
        for (Termekek1 k: list1) {
            System.out.println(k);
        }
        System.out.println();
        Collections.sort(list2);
        for (Termekek2 h: list2) {
            System.out.println(h);
        }
    }
}
class Termekek1 implements Comparable<Termekek1>{

    String shopname;

    String productname;

    Integer discount;

    public Termekek1(String shopname, String productname, Integer discount) {
        this.shopname = shopname;
        this.productname = productname;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return productname + " (" + shopname + "): " + discount + "%";
    }

    @Override
    public int compareTo(Termekek1 o) {
        int res = Integer.compare(o.discount,discount);
        if(res == 0){
            res = shopname.compareTo(o.shopname);
            if(res == 0){
                res = productname.compareTo(o.productname);
            }
        }
        return res;
    }
}

class Termekek2 implements Comparable<Termekek2>{

    String shopname;

    String productname;

    Integer discount;

    public Termekek2(String shopname, String productname, Integer discount) {
        this.shopname = shopname;
        this.productname = productname;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return productname + " (" + shopname + "): " + discount + "%";
    }

    @Override
    public int compareTo(Termekek2 o) {
        int res = shopname.compareTo(o.shopname);
        if(res == 0){
            res = Integer.compare(o.discount,discount);
            if(res == 0){
                res = productname.compareTo(o.productname);
            }
        }
        return res;
    }
}