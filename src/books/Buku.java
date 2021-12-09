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
public abstract class Buku {
    public String kode;
    public String judul;
    public String author;
    public int halaman;
    
    // hitung harga buku
    public abstract double harga();
    
    // menampilkan detil data buku
    public abstract void view();
    
    // constructor
    public Buku(String a, String b, String c, int d){
        this.kode = a;
        this.judul = b;
        this.author = c;
        this.halaman = d;
    }
}
