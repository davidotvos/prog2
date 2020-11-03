import java.util.*;

public class repuloterek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        List<repulok> l= new ArrayList<>();
        for(int i = 0; i < n; i++){
            String[] data = sc.nextLine().split(";");
            l.add(new repulok(data[0],data[1],Integer.parseInt(data[2]),Integer.parseInt(data[3])));
        }
        Collections.sort(l);
        for (repulok h:l) {
            System.out.println(h);
        }
    }
}
class repulok implements Comparable<repulok>{
    String name;

    String city;

    int quantity;

    int length;

    public repulok(String name, String city, int quantity, int length){
        this.name = name;
        this.city = city;
        this.quantity= quantity;
        this.length = length;
    }
    public int compareTo(repulok r){
        int res = Integer.compare(r.quantity,quantity);
        if(res == 0){
            res = Integer.compare(r.length,length);
            if(res == 0){
                res = name.compareTo(r.name);
            }
        }
        return res;

    }
    public String toString(){
        return name + " (" + city +"): " + length;
    }
    /*static class Order implements Comparator<repulok>{

        @Override
        public int compare(repulok o1, repulok o2) {
            return o1.name.compareTo(o2.name);
        }
    }*/
}

