package Jobsheet9;

public class ArrayNilai24 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] nilaiAkhir = new int [10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukan nilai akhir ke- " + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
}
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70){
                System.out.println("Mahasiswa ke-" + i + " Lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + i + " Tidak Lulus!");
            }
        }

    }
}
