/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import interfaces.*;

/**
 *
 * @author rosihanari
 */
public class TextBook extends Buku implements Diskon {

    // constructor
    public TextBook(String a, String b, String c, int d){
        super(a, b, c, d);
    }
    
    // implementasi perhitungan harga textbook
    @Override
    public double harga() {
        return this.halaman * 150.0;
    }

    // implementasi view data textbook
    @Override
    public void view() {
        System.out.println("Kode Buku        : " + this.kode);
        System.out.println("Judul Buku       : " + this.judul);
        System.out.println("Pengarang        : " + this.author);
        System.out.println("Harga Awal (Rp)  : " + this.harga());
        System.out.println("Diskon (Rp)      : " + this.hitungDiskon());
        System.out.println("Harga Akhir (Rp) : " + (this.harga() - this.hitungDiskon()));
    }

    // implementasi perhitungan diskon
    @Override
    public double hitungDiskon() {
        double disc = 0.02;
        return disc * this.harga();
    }
    
}
