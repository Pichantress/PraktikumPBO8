/**
 * File : BangunDatarGeneric.java
 * Deskripsi : Kelas Konstruksi generic untuk BangunDatar
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}


// uji coba T diganti dengan T1
// public class BangunDatarGeneric<T1 extends BangunDatar> {
//     private T1 bangunDatar;

//     public void set(T1 tipeBangunDatar){
//         bangunDatar = tipeBangunDatar;
//     }

//     public T1 get() {
//         return bangunDatar;
//     }

//     public double hitungKeliling(){
//         return bangunDatar.hitungKeliling();
//     }
// }

// uji coba T diganti dengan T2
// public class BangunDatarGeneric<T2 extends BangunDatar> {
//     private T2 bangunDatar;

//     public void set(T2 tipeBangunDatar){
//         bangunDatar = tipeBangunDatar;
//     }

//     public T2 get() {
//         return bangunDatar;
//     }

//     public double hitungKeliling(){
//         return bangunDatar.hitungKeliling();
//     }
// }

// uji coba T diganti dengan T1234
// public class BangunDatarGeneric<T1234 extends BangunDatar> {
//     private T1234 bangunDatar;

//     public void set(T1234 tipeBangunDatar){
//         bangunDatar = tipeBangunDatar;
//     }

//     public T1234 get() {
//         return bangunDatar;
//     }

//     public double hitungKeliling(){
//         return bangunDatar.hitungKeliling();
//     }
// }


// Kesimpulan:
// Mengganti 'T' dengan 'T1', 'T2', atau 'T1234'
// tidak akan mempengaruhi fungsionalitas kelas 'BangunDatarGeneric'.
// Nama parameter tipe generik hanya merupakan 
// penamaan yang dapat diubah sesuai preferensi 
// pengguna, dan tidak memiliki pengaruh terhadap 
// cara kelas tersebut beroperasi.