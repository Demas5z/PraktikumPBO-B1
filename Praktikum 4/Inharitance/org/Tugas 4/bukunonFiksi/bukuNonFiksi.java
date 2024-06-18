/*
    Nama        : Demas Haikal Azizi
    NIM         : 24060122140161
    Nama File   : bukuNonFiksi.java
    Deskripsi   : File Class dari bukuNonFiksi.java
*/
package bk.bukunonFiksi;

import bk.buku.Buku;

public class bukuNonFiksi extends Buku{
    protected String subjek;
    protected int jumlahHalaman;
    protected double harga;

    public bukuNonFiksi (String judul, String penulis, String tahunPenerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunPenerbit);
        setSubjek(subjek);;
        setJumlahHalaman(jumlahHalaman);;
        this.harga = harga;
    }

    public String getSubjek(){
        return this.subjek;
    }

    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }

    public double getHarga(){
        return this.harga;
    }

    public void setSubjek(String subjek){
        this.subjek = subjek;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void view(){
        super.view();
        System.out.println("Subjek : " + this.subjek);
        System.out.println("Jumlah Halaman : " + this.jumlahHalaman);
        System.out.println("Harga : " + this.harga);
    }

    
}
