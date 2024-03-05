public class Titik{
    // deklarasi atribut
    private double absis;
    private double ordinat;
    private static int counterTitik;

    // deklarasi konstruktor
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //deklarasi overloading constructor
    public Titik(double a, double b){
        absis = a;
        ordinat = b;
        counterTitik++;
    }
    //deklarasi method
    public void setAbsis(double a){
        absis = a;
    }
    public void setOrdinat(double o){
        ordinat = o;
    }
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }
    int getCounterTitik(){
        return counterTitik;
    }
}