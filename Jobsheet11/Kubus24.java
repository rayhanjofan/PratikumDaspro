package Jobsheet11;

import java.util.Scanner;

public class Kubus24 {

    static double volume(double sisi) {
        return sisi * sisi * sisi;
    }

    static double luasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();

        double vol = volume(sisi);
        double lp = luasPermukaan(sisi);

        System.out.println("Volume Kubus          : " + vol);
        System.out.println("Luas Permukaan Kubus  : " + lp);
    }
}
