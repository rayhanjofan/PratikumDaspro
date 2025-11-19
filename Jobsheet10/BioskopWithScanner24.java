package Jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    String lagi = "y";

                    while (lagi.equalsIgnoreCase("y")) {
                        String nama;
                        int baris, kolom;

                        System.out.print("Masukkan nama penonton: ");
                        nama = sc.nextLine();

                        while (true) {
                            System.out.print("Masukkan baris (0 - " + (penonton.length - 1) + "): ");
                            baris = sc.nextInt();

                            if (baris < 0 || baris >= penonton.length) {
                                System.out.println("Baris tidak tersedia. Coba lagi!");
                            } else {
                                break;
                            }
                        }
                        while (true) {
                            System.out.print("Masukkan kolom (0 - " + (penonton[0].length - 1) + "): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (kolom < 0 || kolom >= penonton[0].length) {
                                System.out.println("Kolom tidak tersedia. Coba lagi!");
                            } else {
                                break;
                            }
                        }
                        while (penonton[baris][kolom] != null) {
                            System.out.println("!!! Kursi baris " + baris + ", kolom " + kolom + " sudah terisi!");

                            while (true) {
                                System.out.print("Masukkan baris lain (0 - " + (penonton.length - 1) + "): ");
                                baris = sc.nextInt();
                                if (baris < 0 || baris >= penonton.length) {
                                    System.out.println("Baris tidak tersedia. Coba lagi!");
                                } else {
                                    break;
                                }
                            }
                            while (true) {
                                System.out.print("Masukkan kolom lain (0 - " + (penonton[0].length - 1) + "): ");
                                kolom = sc.nextInt();
                                sc.nextLine();
                                if (kolom < 0 || kolom >= penonton[0].length) {
                                    System.out.println("Kolom tidak tersedia. Coba lagi!");
                                } else {
                                    break;
                                }
                            }
                        }
                        penonton[baris][kolom] = nama;
                        System.out.println("Data penonton berhasil disimpan!");

                        System.out.print("Input penonton lain? (y/n): ");
                        lagi = sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("\n===== DAFTAR PENONTON =====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
