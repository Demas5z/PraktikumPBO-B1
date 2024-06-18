/*
    Nama        : Demas Haikal Azizi
    NIM         : 24060122140161
    Nama File   : Buku.java
    Deskripsi   : File Class dari Buku.java
*/

package bk.buku;

public class Buku {
    private String judul;
    protected String penulis;
    protected String tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit){
        setJudul(judul);
        setPenulis(penulis);;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getPenulis(){
        return this.penulis;
    }

    public String getTahunTerbit(){
        return this.tahunTerbit;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void view(){
        System.out.println("Judul : " + this.judul);
        System.out.println("Penulis : " + this.penulis);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
    }
 
}