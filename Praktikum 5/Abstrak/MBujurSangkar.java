import java.util.Scanner;

class MBujurSangkar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas Bujur Sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}

//Pertanyaan
//Apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar ? jelaskan !

//Jawaban
//Jika kelas BujurSangkar tidak mengimplementasikan metode abstrak yang ada 
//dalam kelas BangunDatar, maka akan menghasilkan kesalahan kompilasi karena 
//kelas tersebut harus memasukkan metode abstrak hitungLuas(double sisi) yang 
//telah dideklarasikan dalam kelas BangunDatar.





