/*
    Nama        : Demas Haikal Azizi
    NIM         : 2406012214061
    Nama File   : main.java
    Deskripsi   : File Main dari proyek buku
*/
package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.bukuAkademik;

public class Main {
    public static void main(String[] args) {
        bukuNovel bukuNaruto = new bukuNovel("Naruto", "Satoshi", "2022", "anime", 200, 100000);
        bukuNaruto.view();
        bukuAkademik caraCoding = new bukuAkademik("Dasar Coding", "Mahmed", "2010", "Coding", 559, 50000);
        caraCoding.view();
    }
}