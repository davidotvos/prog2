import java.util.Scanner;

public class szept14 {
    public static void main(String[] args) {

        //Boolean
        /*boolean valtozo = false;

        if(valtozo){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }*/

        //Stringkezelő függvények
        /*  charAt()
            indexOf()
            startsWith()
            endsWith()
            toUpperCase()
            toLowerCase()
            trim()
            subString()
            replace()
            contains()
         */

        /*String nev = "szoveg";
        System.out.println(nev.replace("z", "k").substring(1,3));*/

        //String formázás
        /*String name = "Elek";
        String gender = "male";
        int age = 23;

        String result = String.format("%s (%s), %d", name, gender, age);

        System.out.println(result);*/

        //Kerjünk be egy nevet és köszöntsük
        Scanner sc = new Scanner(System.in);
        System.out.println("Mi a neved?");
        String nev = sc.nextLine();
        System.out.println(udv(nev));

    }

    static String udv(String nev){
        return(String.format("Hello %s!!!",nev));
    }

    //1.feladat
    //Írjunk egy egyszerű számológépet. Bekérünk 2db számot és egy karaktert. Legyen egy metódus ami megkapja ezt a 3 paramétert. (+,-,*,/) Hajta végre és írja ki

    //2.
    //Kérjünk be egy szót és írjuk ki nagybetűkkel és cseréljük ki az összes 'a' betűt csillagra(*)

    //3.
    //Kérjünk be egy szót, amennyiben a 'ha' prefixel kezdődik akkor írjuk ki, ha nem akkor adjunk vissza egy üres Stringet.

    //4.
    //Kérjünk be szavakat addig amíg egy logikai változó értéke igaz. Amennyiben a bekért szavak közül az egyik tartalmaz 'e' betűt akkor leáll a ciklus
}

