/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbuku;

import books.*;
import java.util.ArrayList;

/**
 *
 * @author rosihanari
 */
public class ProjectBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // membuat array list of data buku
        ArrayList<Buku> dataBuku = new ArrayList<>();
        
        // menambahkan bbrp data buku ke dalam array list
        dataBuku.add(new TextBook("B001", "Title 1", "Mr. A", 120));
        dataBuku.add(new Komik("K001", "Title 2", "Mr. B", 200));
        dataBuku.add(new TextBook("B002", "Title 3", "Mr. C", 170));
        dataBuku.add(new Majalah("M001", "Title 4", "Mr. D", 150));
        
        // menampilkan detil tiap buku
        for(Buku item: dataBuku){
            item.view();
            System.out.println("-------");
        }
        
    }
    
}
