package Jobsheeet11;

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
        System.out.println("1. Kopi Hitam - 15,000");
        System.out.println("2. Cappuccino - 20,000");
        System.out.println("3. Latte      - 22,000");
        System.out.println("4. Teh Tarik  - 12,000");
        System.out.println("5. Roti Bakar - 10,000");
        System.out.println("6. Mie Goreng - 18,000");
        System.out.println("========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON30");
    }
}

