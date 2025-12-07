package Jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe24  {

    static void inputPenjualan(int[][] data, Scanner sc) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nInput penjualan untuk Menu " + (i + 1) + ":");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " = ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilData(int[][] data) {
        System.out.println("\n=== Tabel Penjualan ===");
        System.out.print("Menu/Hari\t");

        for (int h = 0; h < data[0].length; h++) {
            System.out.print("H" + (h + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print("Menu " + (i + 1) + "\t\t");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void menuTertinggi(int[][] data) {
        int maxIndex = 0;
        int maxTotal = 0;

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                maxIndex = i;
            }
        }

        System.out.println("\n=== Menu Terlaris ===");
        System.out.println("Menu ke-" + (maxIndex + 1) +
                           " adalah yang paling laris dengan total penjualan = " + maxTotal);
    }

    static void rataRataMenu(int[][] data) {
        System.out.println("\n=== Rata-rata Penjualan Setiap Menu ===");

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }

            double rata = (double) total / data[i].length;
            System.out.println("Menu " + (i + 1) + " rata-rata = " + rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = sc.nextInt();

        int[][] penjualan = new int[jumlahMenu][jumlahHari];

        inputPenjualan(penjualan, sc);
        tampilData(penjualan);
        menuTertinggi(penjualan);
        rataRataMenu(penjualan);
    }
}
