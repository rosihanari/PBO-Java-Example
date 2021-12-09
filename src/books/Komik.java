/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author rosihanari
 */
public class Komik extends Buku {

    // constructor
    public Komik(String a, String b, String c, int d){
        super(a, b, c, d);
    }
    
    // implementasi perhitungan harga buku komik
    @Override
    public double harga() {
        return this.halaman * 50.0;
    }

    // implementasi untuk view data buku komik
    @Override
    public void view() {
        System.out.println("Kode Buku        : " + this.kode);
        System.out.println("Judul Buku       : " + this.judul);
        System.out.println("Pengarang        : " + this.author);
        System.out.println("Harga (Rp)       : " + this.harga());
    }
    
}
