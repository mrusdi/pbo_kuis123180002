import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            try {
                int pilih;

                System.out.println("\nMENU FORM PENDAFTARAN");
                System.out.println("1. Asisten Laboratorium");
                System.out.println("2. Admin Laboratorium");
                System.out.print("Pilih Jenis Form : ");

                pilih = input.nextInt();

                switch (pilih){
                    case 1:
                        pendaftaranAslab();
                        break;
                    case 2:
                        pendaftaranAdmin();
                        break;

                    default:
                        System.out.println("Pilihan tidak ada");
                }
            }
            catch (NumberFormatException e){
                System.err.println(e.getMessage() + ", Pilihan tidak ada");
            }
        }

    }

    private static void pendaftaranAslab() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\nFORM PENDAFTARAN ASISTEN LABORATORIUM");

            System.out.print("Berapa banyak data yang akan dimasukkan : ");
            int banyakData = input.nextInt();

            for (int i=0; i<banyakData; i++){
                System.out.print("\nMasukkan Nim : "); String nim = input.next();
                System.out.print("Masukkan Nama : ");
                input = new Scanner(System.in); String nama = input.nextLine();

                System.out.print("Masukkan Nilai Tes Tulis : "); float tulis = input.nextFloat();
                System.out.print("Masukkan Nilai Tes Coding : "); float coding = input.nextFloat();
                System.out.print("Masukkan Nilai Tes Wawancara : "); float wawancara = input.nextFloat();
                System.out.print("Masukkan Nilai Tes Microteaching : "); float micro = input.nextFloat();

                Daftar mahasiswa = new Daftar(nama,nim,tulis,coding,wawancara,micro,"Aslab");
                mahasiswa.hasil();
            }
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    private static void pendaftaranAdmin() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\nFORM PENDAFTARAN ADMIN LABORATORIUM");

            System.out.print("Berapa banyak data yang akan dimasukkan : ");
            int banyakData = input.nextInt();
            System.out.println();

            for (int i=0; i<banyakData; i++){
                System.out.print("Masukkan Nim : "); String nim = input.next();
                System.out.print("Masukkan Nama : ");
                input = new Scanner(System.in); String nama = input.nextLine();

                System.out.print("Masukkan Nilai Tes Tulis : "); float tulis = input.nextFloat();
                System.out.print("Masukkan Nilai Tes Coding : "); float coding = input.nextFloat();
                System.out.print("Masukkan Nilai Tes Wawancara : "); float wawancara = input.nextFloat();
                System.out.print("Masukkan Nilai Tes Praktek Jaringan : "); float jaringan = input.nextFloat();

                Daftar mahasiswa = new Daftar(nama,nim,tulis,coding,wawancara,jaringan,"Admin");
                mahasiswa.hasil();
            }
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}