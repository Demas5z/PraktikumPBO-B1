// File : Asersi2
// Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

//Jawaban : Secara konsep pesan kesalahan dari assertion tidak akan muncul jika asersi dinonaktifkan saat menjalankan program. 
//Ini karena asersi secara default dinonaktifkan untuk meningkatkan kinerja program dalam mode produksi.