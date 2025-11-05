package Jobsheet8;

public class NilaiKelompok24 {
    public static void main(String[] args) {
       java.util.Scanner scanner = new java.util.Scanner(System.in);
       int nilai, j, i;
       float totalNilai, rataNilai;
       
       i = 1;
       while (i <= 6) {
           System.out.println("Kelompok " + i);
           totalNilai = 0;
           for (j = 1; j <= 5; j++) {
               System.out.print("Nilai dari Kelompok Penilai " + j + " : ");
               nilai = scanner.nextInt();
               totalNilai += nilai;
           }
           rataNilai = totalNilai / 5;
           System.out.println("Rata-rata Nilai Kelompok " + i + " : " + rataNilai);
           i++;
       }
   }
}

