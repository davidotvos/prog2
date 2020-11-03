import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mozi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        List<filmek> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String[] data = sc.nextLine().split(";");
            l.add(new filmek(data[0], Integer.parseInt(data[1]),data[2],Integer.parseInt(data[3]),Integer.parseInt(data[4])));
        }
        Collections.sort(l);
        for (filmek h:l
             ) {
            System.out.println(h);
        }
    }
}
class filmek implements Comparable<filmek>{

    String name;

    Integer year;

    String director;

    Integer expense;

    Integer income;

    public filmek(String name, Integer year, String director, Integer expense, Integer income){
        this.name = name;
        this.year = year;
        this.director = director;
        this.expense = expense;
        this.income = income;
    }
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(filmek o) {
        int res = Integer.compare(expense-income,o.expense-o.income);
        if(res == 0){
            res = Integer.compare(year,o.year);
            if(res == 0){
                res = Integer.compare(o.income,income);
                if(res == 0){
                    res = name.compareTo(o.name);
                }
            }
        }
        return res;
    }
}
