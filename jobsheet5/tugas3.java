package jobsheet5;

import java.util.Scanner;

public class tugas3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String jenisPengguna;
        int jumlahSks;

        System.out.println("Masukkan jenis pengguna (Mahasiswa/Dosen): ");
        jenisPengguna = sc.nextLine();
        
        if (jenisPengguna.equalsIgnoreCase("Dosen")){
           System.out.println("Akses wifi diberikan (dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Masukkan jumlah SKS yang diambil: ");
            jumlahSks = sc.nextInt();
            if (jumlahSks >= 12) {
                System.out.println("Akses wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses wifi ditolak, sks kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
    }
}
