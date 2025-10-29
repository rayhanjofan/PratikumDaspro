package Jobsheet7;

public class tugas2 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int jenis = 0;
        int total = 0;
        int durasi;
        int biayaTransaksi = 0;

        do  {
            System.out.println("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();
            if (jenis == 0) {
                break;
            }
            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid (Harap masukkan 1, 2, atau 0).");
                continue;
            }
        } while (jenis != 1 && jenis != 2);
        if (jenis == 1 || jenis == 2) {
            System.out.print("Masukkan durasi parkir (dalam jam): ");
            durasi = sc.nextInt();
            if (durasi > 5) { 
                biayaTransaksi = 12500; 
                System.out.println("Durasi > 5 jam. Biaya flat: Rp 12.500.");
            } else { 
                if (jenis == 1) { 
                    biayaTransaksi = durasi * 3000; 
                    System.out.println("Mobil " + durasi + " jam. Biaya: Rp " + biayaTransaksi);
                } else { 
                    biayaTransaksi = durasi * 2000; 
                    System.out.println("Motor " + durasi + " jam. Biaya: Rp " + biayaTransaksi);
                }
            }
            total += biayaTransaksi;
        } else {
            System.out.println("Jenis kendaraan tidak valid (Harap masukkan 1, 2, atau 0).");
        }
        while (jenis != 0);
        System.out.println("Total pembayaran parkir hari ini: Rp " + total);
    }
}
        
       