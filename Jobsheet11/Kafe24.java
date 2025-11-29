package Jobsheet11;

import java.util.Scanner;

public class Kafe24 {

    static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {

        System.out.println("Selamat datang, " + namaPelanggan + "!");
        System.out.println("Status member: " + (isMember ? "Ya" : "Tidak"));

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo: DISKON50 (Diskon 50%)");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo: DISKON30 (Diskon 30%)");
        } else {
            System.out.println("Kode promo tidak valid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - 15,000");
        System.out.println("2. Cappuccino   - 20,000");
        System.out.println("3. Latte        - 22,000");
        System.out.println("4. Teh Tarik    - 12,000");
        System.out.println("5. Roti Bakar   - 10,000");
        System.out.println("6. Mie Goreng   - 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga24(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            int diskon = hargaTotal / 2;
            System.out.println("Diskon 50% = Rp. " + diskon);
            hargaTotal -= diskon;

        } else if (kodePromo.equals("DISKON30")) {
            int diskon = (int) (hargaTotal * 0.30);
            System.out.println("Diskon 30% = Rp. " + diskon);
            hargaTotal -= diskon;

        } else {
            System.out.println("Kode promo invalid (tidak ada diskon).");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, "DISKON30");

        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenis = sc.nextInt();

        int totalKeseluruhan = 0;
        for (int i = 1; i <= jumlahJenis; i++) {

            System.out.print("\nMasukkan nomor menu ke-" + i + ": ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            sc.nextLine();

            System.out.print("Masukkan kode promo: ");
            String kodePromo = sc.nextLine();

            int totalHarga = hitungTotalHarga24(pilihanMenu, banyakItem, kodePromo);

            System.out.println("Total harga menu ke-" + i + ": Rp. " + totalHarga);

            totalKeseluruhan += totalHarga;
        }

        System.out.println("\n================================");
        System.out.println("TOTAL KESELURUHAN PESANAN: Rp. " + totalKeseluruhan);
        System.out.println("================================");
    }
}