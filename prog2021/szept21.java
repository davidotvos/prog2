import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1.other;

//1.feladat     Írjunk egy Sör osztályt, Van márkája, alkoholfoka, ára. Alkoholfok nem lehete kisebb mint 4 és nem lehet nagyobb mint 8,5
//              200<= ár <=1500, getter setterek használni.
//2.rész        Ennek az ostálynak legyen formázott kiiratása.: "Márka fok %, ár Ft"
//3.rész        Legyen 2 metódusa az osztályunknak. Paraméterként megadott sör erősebb-e mint amire meghívjuk a metódust. Ugyanezt az árral.
//4.rész        Vegyunk fel egy új logikai attributumot ami meghatározza hogy kézműves-e, legyen egy osztályszintű változó ami a kézműves söröket számolja
public class szept21 {
    public static void main(String[] args) {
        Movie m1 = new Movie("Shang Chi", 2021, 8.4);
        Movie m2 = new Movie("Godzilla", 1987, 17.6);
        System.out.println(m1);
        System.out.println(m2);
        Circle c1 = new Circle(-1.2);
        Circle c2 = new Circle(2.77);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(Movie.movieCount);


    }

}
class Circle{
    private double rad;

    public Circle(double rad) {
        setRad(rad);
    }

    public void setRad(double rad) {
        this.rad = rad;
        if(rad < 0.1){
            this.rad = 0.1;
        }
    }

    public double getRad() {
        return rad;
    }

    public boolean isSmaller(Circle c){
        if(this.rad < c.getRad()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Sugar = %.1f", this.rad);
    }
}

class Movie{
    String title;
    int year;
    private double score;

    static public int movieCount = 0;

    public Movie(String title, int year, double score) {
        this.title = title;
        this.year = year;
        setScore(score);
        movieCount++;
    }

    public void setScore(double score) {
        this.score = score;
        if (score > 10.0){
            this.score = 10.0;
        }
        if (score < 0.0){
            this.score = 0.0;
        }

    }

    @Override
    public String toString() {
        return String.format("%s (%d): %.1f", this.title, this.year, this.score);
    }
}

