package Jobsheet7;

public class SiakadWhile24 {
     public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int nilai, jml, i = 0;

        System.out.println("Masukan Jumlah Mahasiswa: ");
        jml = sc.nextInt();
        while (i < jml) {
            System.out.println("Masukan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukan lagi nilai yang valid!");
            continue;   
            }
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " : A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " : B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " : B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " : C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " : C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " : D");
            } else {
                System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " : E");
            }
            i++;
        }
    
}
