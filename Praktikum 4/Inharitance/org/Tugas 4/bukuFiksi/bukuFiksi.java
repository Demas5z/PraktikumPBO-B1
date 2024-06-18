/*
    Nama        : Demas Haikal Azizi
    NIM         : 24060122140161
    Nama File   : bukuFiksi.java
    Deskripsi   : File Class dari bukuFiksi.java
*/

package bk.bukuFiksi;

import bk.buku.Buku;

public class bukuFiksi extends Buku {
    protected String genre;
    protected int jumlahHalaman;
    protected double harga;

    public bukuFiksi(String judul, String penulis, String tahunPenerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunPenerbit);
        setGenre(genre);
        setJumlahHalaman(jumlahHalaman);
        this.harga = harga;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }

    public double getHarga(){
        return this.harga;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    
    @Override
    public void view(){
        super.view();
        System.out.println("Genre : " + this.genre);
        System.out.println("Jumlah Halaman : " + this.jumlahHalaman);
        System.out.println("Harga : " + this.harga);
    }
}