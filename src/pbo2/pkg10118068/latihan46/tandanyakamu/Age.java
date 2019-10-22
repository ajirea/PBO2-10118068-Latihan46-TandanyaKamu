/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan46.tandanyakamu;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Membuat program berbasis object untuk menentukan tanda
 * seseorang berdasarkan umur
 */
public class Age {
    private int yearBirth, yearNow;
    private final String red = "\u001B[31m";
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth; 
    }
    
    public String tandanyaKamu(int umur) {
        String tanda;
        if(umur >= 0 && umur <= 5) tanda = "LAGI LUCU-LUCU NYA";
        else if(umur > 5 && umur <= 10) tanda = "MASIH ANAK-ANAK";
        else if(umur > 10 && umur <= 13) tanda = "MASIH REMADJA";
        else if(umur > 13 && umur <= 19) tanda = "ALAY";
        else if(umur > 19 && umur <= 29) tanda = "LAGI GALAU NYARI JODOH";
        else if(umur > 29 && umur <= 35) tanda = "LAGI SIBUK NYARI UANG";
        else if(umur > 35 && umur <= 150) tanda = "SUDAH TUA";
        else tanda = "TIDAK TERDETEKSI DI KEHIDUPAN";
        
        return red+tanda;
    }
}
