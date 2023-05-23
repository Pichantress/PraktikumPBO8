/**
 * File : MapTest.java
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        // kunci -> integer, nilai -> string
        Map<Integer,String> map = new HashMap<Integer,String>();
        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        map.put(3, "tiga");
        map.put(4, "empat");
        map.put(5, "lima");
        map.put(6, "enam");
        map.put(7, "tujuh");
        map.put(8, "delapan");
        map.put(9, "sembilan");
        map.put(10, "sepuluh");

        // mengambil elemen pertama
        // System.out.println(map.get(1));
        
        // mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();
        // bagaimana iterasi untuk mengambil keseluruhan
        // nilai dari kunci ? tulispada laporan anda!
        // petunjuk : gunakan iterasi seperti program ArrayListTest
        // Jawab :
        for(Integer k: key){
            System.out.println("key : "+k+", value : "+map.get(k));            
        }
        // kode diatas akan menampilkan output
        // berupa iterasi dari setiap key dan value
        // yang ada pada collection Map
    }
}
