/**
 * File : ArrayListTest.java
 * Deskripsi : program penggunaan objek ArrayList sebagi collection class
 */

import java.util.ArrayList;

public class ArrayListTest{
    public static void main (String[] args){
        // inisisalisasi ArrayList yang dapat
        // berisi objek String 
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generic");
        // menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for(String s: strings){
            System.out.print(s+" ");
        }
    }
}