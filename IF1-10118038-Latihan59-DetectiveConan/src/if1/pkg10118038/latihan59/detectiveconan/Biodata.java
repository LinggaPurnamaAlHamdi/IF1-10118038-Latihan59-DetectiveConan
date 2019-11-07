/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan59.detectiveconan;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan informasi 
 *                     Karakter Detective Conan
 */
public class Biodata extends Profile {

    @Override
    public int pilihan() {
        return super.pilihan();
    }

    @Override
    public void tampilProfile() {
        System.out.println("======Profile Karakter======");
        System.out.println("Nama \t: " +getNamaLengkap());
        System.out.println("Biodata\t: " +getBiodata());
    }
    
}
