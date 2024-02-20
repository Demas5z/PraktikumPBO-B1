class Titik{
    // deklarasi atribut
    double absis;
    double ordinat;
    static int counterTitik;

    // deklarasi konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //deklarasi overloading constructor
    Titik(double a, double b){
        absis = a;
        ordinat = b;
        counterTitik++;
    }
    //deklarasi method
    void setAbsis(double a){
        absis = a;
    }
    void setOrdinat(double o){
        ordinat = o;
    }
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    int getCounterTitik(){
        return counterTitik;
    }
}