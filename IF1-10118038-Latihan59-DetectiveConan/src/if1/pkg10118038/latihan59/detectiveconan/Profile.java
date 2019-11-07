/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan59.detectiveconan;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan informasi 
 *                     Karakter Detective Conan
 */
public abstract class Profile {
     protected String namaLengkap, biodata ;
    protected int id;

    public Profile() {
        
        System.out.println("====Detective Conan====");
        System.out.println("1. Karakter Detective Conan");
        System.out.println("2. Karakter Detektif");
        System.out.println("3. Karakter Anak - Anak");
        System.out.println("4. Karakter yg memiliki Persamaan");
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public int getId() {
        return id;
    }

    public String getBiodata() {
        return biodata;
    }
    
    
    
    public int pilihan(){
        System.out.print("Masukkan yang anda pilih = ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    public abstract void tampilProfile();
}