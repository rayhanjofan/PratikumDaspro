package Jobsheet9;

public class ArrayRataNilai24 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int jumlahLulus = 0, jmlMahasiswa, jumlahTdkLulus = 0;
        double totalLulus = 0, totalTdkLulus = 0, rata2Lulus, rata2TdkLulus;

        System.out.print("Masukan jumlah mahasiswa :");
        jmlMahasiswa = sc.nextInt();
        int [] nilaiMhs = new int [jmlMahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            }else{
                totalTdkLulus += nilaiMhs [i];
                jumlahTdkLulus++;
            }
        }
        rata2Lulus = totalLulus / jumlahLulus;
        rata2TdkLulus = totalTdkLulus / jumlahTdkLulus;
        System.out.println("Jumlah mahasiswa yang lulus adalah: " + jumlahLulus);
        System.out.println("Rata-rata Nilai mahasiswa yang lulus adalah = " + rata2Lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus adalah: " + jumlahTdkLulus);
        System.out.println("Rata-rata Nilai mahasiswa yang tidak lulus adalah = " + rata2TdkLulus);
    }   
}
