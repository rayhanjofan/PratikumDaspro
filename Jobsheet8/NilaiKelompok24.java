package Jobsheet8;

public class NilaiKelompok24 {
    public static void main(String[] args) {
       java.util.Scanner scanner = new java.util.Scanner(System.in);
       
       int nilai, j, i;
       int kelompokTertinggi = 0;
       float rataTertinggi = 0;
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
           if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
           }
           i++;
       }
       System.out.println("Kelompok " + kelompokTertinggi + " adalah Kelompok dengan Rata-rata Nilai Tertinggi : " + rataTertinggi);
   }
}
