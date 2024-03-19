import java.util.Scanner;

public class MLingkaran{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari jari lingkaran : ");
        double jejari = scan.nextDouble();
        scan.close();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas Lingkaran dengan "+jejari+"satuan adalah "+l.hitungLuas());
    }
}