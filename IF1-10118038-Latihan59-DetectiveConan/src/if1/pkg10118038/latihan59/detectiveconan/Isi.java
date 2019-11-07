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
public final class Isi extends Biodata implements Karakter, Detektif, Anak, Persamaan{

    public Isi() {
        int pilih = pilihan();
        switch (pilih){
            case 1:
                this.id = 1;
                character(tampilCharacter());
                tampilProfile();
                break;
            case 2 :
                this.id = 2;
                tampilDetektif();
                break;
            case 3 :
                this.id = 3;
                tampilAnak();
                break;
            case 4 :
                this.id = 4;
                tampilPersamaan();
                break;
            default :
                System.out.println("Tidak ditemukan");
                break;
        }
        
    }
    
    @Override
    public void tampilDetektif(){
        System.out.println("\n==========Detektif==========");
        System.out.println("1. Shinichi Kudo/Conan Edogawa");
        System.out.println("2. Kogoro Mouri");
        System.out.println("3. Heiji Hattori");
        
    }    
    @Override
    public void character(int pilihan) {
        int pilih = pilihan;
        switch (pilih){
            case 1:
                this.id = 1;
                this.namaLengkap = "Shinichi Kudo/Conan Edogawa";
                this.biodata = "tokoh protagonis utama dari serial Detektif Conan. Dia kemudian bernama samaran Conan Edogawa (江戸川 コナン Edogawa Conan).\n"+
                        "Conan Edogawa berasal dari nama Sir Arthur Conan Doyle yang merupakan nama pengarang serial petualangan Sherlock Holmes dan Edogawa Rampo \n"+
                        "yang merupakan nama seorang pengarang sekaligus kritikus cerita detektif.\n"+ 
                        "Shinichi Kudo adalah seorang detektif SMU terkenal yang sering membantu polisi menyelesaikan kasus sulit.\n" +
                        "Suatu hari ketika menginvestigasi 2 orang mencurigakan, yang kemudian diketahui sebagai Gin dan Vodka, dia terlihat oleh Gin, dipukul, lalu dipaksa meminum racun.\n"+
                        "Setelah itu, dia bangun dan menemukan dirinya telah menjadi seorang anak kecil. Menyadari bahwa dua orang tersebut akan menyelidikinya,\n"+ 
                        "Shinichi menggunakan nama samaran Conan Edogawa untuk identitas barunya.\n"+
                        "Dia kemudian tinggal bersama teman masa kecilnya Ran Mouri dan membantu ayahnya Ran Kogoro Mouri yang merupakan seorang detektif swasta, untuk menyelesaikan kasus, \n"+
                        "dengan harapan dapat menemukan kasus yang melibatkan Organisasi Baju Hitam.";        
                break;
            case 2 :
                this.id = 1;
                this.namaLengkap = "Sherry/Ai Haibara";
                this.biodata =  "seorang anggota Organisasi Hitam yang berkhianat pada organisasi tersebut setelah kakaknya, Akemi Miyano, terbunuh di tangan Gin.\n"+
                                "Perempuan yang cerdas dan serius. Melalui tangannya susunan formula misterius warisan orang tuanya yang juga bekerja pada organisasi\n"+
                                "ia menciptakan berbagai macam formula untuk organisasi termasuk racun yang telah mengecilkan tubuhnya serta Shinichi Kudo.\n"+
                                "Dulunya punya hubungan dengan Shuichi Akai karena kakaknya Akemi Miyano merupakan pacar Suichi Akai. Haibara kadang mengucapkan kata yang dalam artinya.\n"+
                                "Dia mencurigai Okiya Subaru yang tinggal di rumahnya Shinichi Kudo sebagai anggota Organisasi Hitam.";
                        
                break;
            case 3 :    
                this.id = 3;
                this.namaLengkap = "Ran Mouri";
                this.biodata =  "Siswi di SMU Teitan yang sekaligus teman sekelas dan semasa kecilnya Shinichi. Ia selalu menunggu kepulangan Shinichi. Ran beberapa kali pernah mencurigai\n"+
                                "Conan yang identitasnya adalah Shinichi, tetapi Conan selalu berhasil mengelabui Ran. \n"+
                                "Ia mempunyai bakat dalam karate, dan takut dengan hantu. Memiliki sifat yang lembut dan gampang menangis.";
                break;
            case 4 :    
                this.id = 4;
                this.namaLengkap = "Sonoko Suzuki";
                this.biodata =  "Sonoko adalah teman sekelas Ran dan juga teman baiknya. Berasal dari keluarga kaya. Ia suka menarik perhatian laki-laki yang dipilihnya.\n"+
                                "Saat ini ia berhubungan dengan Makoto Kyogoku, seseorang yang disebut sebagai Raja Karate yang dulu pernah menolong Sonoko ketika ia akan dibunuh oleh seseorang\n"+ 
                                "bule yang sekaligus pelaku pembunuhan gadis berambut pirang. Saat Kogoro tidak ada, Conan kadang memakai Sonoko untuk membuat analisis.";
                break;
            
            case 5 :    
                this.id = 5;
                this.namaLengkap = "Mitsuhiko Tsuburaya";
                this.biodata =  "Teman Conan yang memiliki pengetahuan yang melebihi kelas 1 sd. Penyuka teknologi. Awalnya ia menyukai Ayumi. Ketika Ai muncul,\n"+ 
                                "ia menaruh hati juga kepada Ai dan sering cemburu karena Ai selalu dekat dengan Conan.";    
                break;
            case 6 :    
                this.id = 6;
                this.namaLengkap = "Genta Kojima (小嶋元太))";
                this.biodata =  "Orang yang otaknya selalu dipenuhi dengan makanan. Awalnya ia berkata Conan adalah pengikutnya, tetapi setelahnya ia tidak pernah mengatakan hal itu. ";    
                break;
            case 7 :    
                this.id = 7;
                this.namaLengkap = "Ayumi Yoshida";
                this.biodata =  "Teman Conan yang juga menyukai Conan. Ia memiliki sifat yang periang dan baik hati. Ia juga menarik perhatian Mitsuhiko dan Genta.\n"+ 
                                "Paling suka sama yang namanya pencarian harta karun dan setiap mendengar itu, Ayumi, Genta, Mitsuhiko langsung bersemangat untuk mencarinya.";
                break;
            case 8 :    
                this.id = 8;
                this.namaLengkap = "Kogoro Mouri";
                this.biodata =  "Kogoro Mouri adalah ayahnya Ran yang bekerja sebagai Detektif. Tetapi, jika ia membuat analisis, pasti analisis itu hanyalah \"asal-asalan\".\n"+ 
                                "Conan yang biasa bersama Kogoro yang selalu bertemu kasus, Kogoro selalu dipakai Conan untuk memecahkan kasus dengan cara menidurkannya dengan peluru bius\n"+ 
                                "dan maka dari itu ia menjadi terkenal dengan sebutan \"Kogoro Tidur\".";
                break;
            case 9 :    
                this.id = 9;
                this.namaLengkap = "Eri Kisaki";
                this.biodata =  "Ibu nya Ran dan juga istri Kogoro. Bekerja sebagai pengacara dan disebut sebagai \"Ratu Pengacara\". Pisah tempat tinggal dengan Kogoro karena Kogoro selalu mabuk-mabukan,\n"+ 
                                "bertaruh, dan sebagainya hal2 yang membuat Eri kesal. Namun, ia masih menaruh perasaan terhadap Kogoro dan cincin kawinnya masih dipakai. Mempunyai kucing yang bernama Goro,\n"+ 
                                "nama tersebut berasal dari nama Kogoro.";
                break;
            case 10 :    
                this.id = 10;
                this.namaLengkap = "Hiroshi Agasa";
                this.biodata =  "Professor yang rumahnya dekat dengan rumah Shinichi. Ketika ia bertemu Shinichi yang tubuhnya menjadi kecil, awalnya ia tidak mempercayai itu adalah Shinichi.\n"+ 
                                "Tetapi akhirnya ia percaya. Ia yang menciptakan berbagai macam peralatan canggih yang dipakai Conan yang dapat berguna sewaktu-waktu ketika Conan membutuhkannya.\n"+ 
                                "Ia yang menemukan Ai yang pingsan didepan rumah Shinichi lalu mengadopsinya.";
                break;
            case 11 :    
                this.id = 11;
                this.namaLengkap = "Kazuha Toyama";
                this.biodata =  "Kazuha adalah teman semasa kecilnya Heiji yang menyukai Heiji. Jika Heiji muncul dalam cerita, ia selalu nampak bersamanya. Terampil dalam Aikido dan takut dengan hantu sama dengan Ran.";
                break;
            case 12 :    
                this.id = 12;
                this.namaLengkap = "Heiji Hattori";
                this.biodata =  "Detektif yang berasal dari barat yang merupakan saingan Shinichi. Setelah mengetahui identitas Conan adalah Shinichi,\n"+ 
                                "mereka menjadi akrab dan sering bekerja sama untuk memecahkan suatu kasus. Ia mempunyai teman sejak kecil sama seperti Shinichi dan Ran,\n"+
                                "yaitu Kazuha. Sepertinya ia mempunyai rasa kepada Kazuha, tetapi ia malu untuk mengatakannya begitu juga sebaliknya. Ayahnya adalah Heizo Hattori yang bekerja di kepolisian Osaka.\n"+ 
                                "Ia juga bisa kendo.";  
                break;
            default :
                System.out.println("Tidak ditemukan");
                break;
                
        }
      
    }

    @Override
    public int tampilCharacter() {
       System.out.println("\n=====Pilih karakter=====");
       System.out.println("-------------------------");
       System.out.println("1. Shinichi Kudo/Conan Edogawa");
       System.out.println("2. Sherry/Ai Haibara");
       System.out.println("3. Ran Mouri");
       System.out.println("4. Sonoko Suzuki");
       System.out.println("5. Mitsuhiko Tsuburaya");
       System.out.println("6. Genta Kojima");
       System.out.println("7. Ayumi Yoshida");
       System.out.println("8. Kogoro Mouri");
       System.out.println("9. Eri Kisaki");
       System.out.println("10. Hiroshi Agasa");
       System.out.println("11. Kazuha Toyama");
       System.out.println("12. Heiji Hattori");
       System.out.print("Pilih Karakter : ");
       Scanner scanner = new Scanner(System.in);
       return scanner.nextInt();
    }

    @Override
    public void tampilAnak() {
        System.out.println("\n======Anak - Anak======");
        System.out.println("1. Shinichi Kudo/Conan Edogawa");
        System.out.println("2. Sherry/Ai Haibara");
        System.out.println("3. Mitsuhiko Tsuburaya");
        System.out.println("4. Genta Kojima");
        System.out.println("5. Ayumi Yoshida");
    }


    @Override
    public void tampilPersamaan() {
        System.out.println("\n======Persamaan======");
        System.out.println("\n=Menggunakan Kacamata=");
        System.out.println("1. Shinichi Kudo/Conan Edogawa");
        System.out.println("2. Eri Kisaki");
        System.out.println("3. Hiroshi Agasa");
        System.out.println("\n===Menggunakan Dasi===");
        System.out.println("1. Shinichi Kudo/Conan Edogawa");
        System.out.println("2. Ran Mouri");
        System.out.println("3. Sonoko Suzuki");
        System.out.println("4. Kogoro Mouri");
        System.out.println("\n=Berubah Menjadi Kecil=");
        System.out.println("1. Shinichi Kudo/Conan Edogawa");
        System.out.println("2. Sherry/Ai Haibara");
        System.out.println("\n====Memiliki Kumis====");
        System.out.println("1. Kogoro Mouri");
        System.out.println("2. Hiroshi Agasa");
        System.out.println("\n====Melakukan Karate====");
        System.out.println("1. Ran Mouri");
        System.out.println("2. Sonoko Suzuki");
    }

}
