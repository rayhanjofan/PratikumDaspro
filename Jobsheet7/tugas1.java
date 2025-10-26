package Jobsheet7;

public class tugas1 {
     public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        int tiket;
        double totalHargaPenjualan = 0;

          do {
             System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
             tiket = sc.nextInt();

             if (tiket < 0) {
                 System.out.println("Jumlah tiket tidak boleh negatif. Silakan masukkan ulang.");
                 continue;
             }
             if (tiket == 0) {
                 break;
             }

             double diskon = 0.0;
             double hargaTotal;

             if (tiket > 10) {
                 diskon = 0.15;
             } else if (tiket > 4) {
                 diskon = 0.10;
             }

             double hargaDasar = tiket * hargaTiket;
             double totalDiskon = hargaDasar * diskon;
             hargaTotal = hargaDasar - totalDiskon;

             totalTiketTerjual += tiket;
             totalHargaPenjualan += hargaTotal;

             System.out.printf("  Transaksi ini: %d tiket. Diskon: %.0f%% (Rp %,.0f). Total Harga: Rp %,.0f\n",
                     tiket, diskon * 100, totalDiskon, hargaTotal);

          } while (true);

          System.out.printf("Total tiket terjual: %d\n", totalTiketTerjual);
          System.out.printf("Total pendapatan: Rp %,.0f\n", totalHargaPenjualan);
     }
}       