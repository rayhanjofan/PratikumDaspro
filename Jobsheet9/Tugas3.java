package Jobsheet9;

import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi daftar menu kafe
        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) { 
                ditemukan = true;
                posisi = i;
                break; 
            }
        }

        System.out.println("\n=== Hasil Pencarian ===");
        if (ditemukan) {
            System.out.println("Makanan \"" + menu[posisi] + "\" tersedia di menu (nomor " + (posisi + 1) + ").");
        } else {
            System.out.println("Maaf, makanan \"" + cari + "\" tidak ada di menu.");
        }

        sc.close();
    }
}
