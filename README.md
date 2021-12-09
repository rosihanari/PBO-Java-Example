# PBO Java Example
 Contoh project Java yang menerapkan konsep PBO: constructor, inheritance, abstraction, polymorfisme, interface

## Studi Kasus

Buatlah program Java untuk menampilkan beberapa buah data buku yang diterbitkan oleh sebuah penerbit.
Terdapat 3 buah jenis buku:
* TextBook
* Komik
* Majalah

Setiap jenis buku memiliki data meliputi:
* Kode Buku
* Judul
* Nama Pengarang (author)
* Jumlah Halaman

Selanjutnya ada beberapa ketentuan sbb:
* Harga buku ditentukan dari banyaknya halaman: Text Boox (Rp 150/halaman), Komik (Rp 50/halaman), Majalah (Rp 75/halaman)
* Terdapat diskon harga untuk jenis buku tertentu: Majalah (1%), Text Book (2%)

<br>

Ide Penyelesaian:

### Classes
* Buku -> Abstract Class (super class)
* TextBook -> subclass dari class Buku
* Majalah -> subclass dari class Buku
* Komik -> subclass dari class Buku

### Interfaces
* Diskon
Interface ini diimplementasikan oleh class TextBook dan Majalah
