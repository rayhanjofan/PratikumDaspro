package Jobsheet9;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMhs;
        int[] nilaiMhs = new int[10];
        double total = 0;
        int nilaiTertinggi;
        int nilaiTerendah;
        double rata2;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMhs = sc.nextInt();

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        
        nilaiTertinggi = nilaiMhs[0];
        nilaiTerendah = nilaiMhs[0];

        
        for (int i = 0; i < jumlahMhs; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        rata2 = total / jumlahMhs;

        System.out.println("\nRata-rata nilai = " + rata2);
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai terendah = " + nilaiTerendah);

    }
}

    