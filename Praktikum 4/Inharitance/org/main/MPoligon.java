package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        PersegiPanjang Persegi = new PersegiPanjang(10, 10, 4);
        Persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+Persegi.hitungLuas());
        Segitiga segitiga = new Segitiga(15, 10, 4);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
        
    }
}