package Jobsheet7;

public class SiakadFor24 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100, lulus = 0, tidakLulus = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                System.out.println("Status: Lulus");
                lulus++;
            } else {
                System.out.println("Status: Tidak Lulus");
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi adalah: " +  tertinggi);
        System.out.println("Nilai terendah adalah: " +  terendah);
        System.out.println("Jumlah siswa lulus: " + (int) lulus);
        System.out.println("Jumlah siswa tidak lulus: " + (int) tidakLulus);
    }
}

