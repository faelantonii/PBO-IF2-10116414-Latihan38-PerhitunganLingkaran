/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan38_PerhitunganLingkaran;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan perhitungan lingkaran
 */
public class PBO_IF2_10116414_PerhitunganLingkaran {
    public static void main(String[] args) {
        Perhitungan lingkaran = new Perhitungan();

        System.out.println("=======Perhitungan Lingkaran=======");
        lingkaran.Input();
        lingkaran.hasilPerhitungan(lingkaran.diameter);
    }
}
