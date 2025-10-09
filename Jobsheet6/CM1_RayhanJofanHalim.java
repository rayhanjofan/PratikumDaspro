package Jobsheet6;

public class CM1_RayhanJofanHalim {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        String nama, kelas;
        long NIM;
        double nilaiTugas1, nilaiUTS1, nilaiUAS1, nilaiAkhir1;
        double nilaiTugas2, nilaiUTS2, nilaiUAS2, nilaiAkhir2;
        String nilaiHuruf1, nilaiHuruf2;
        String status2, status1;


        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("NIM: ");
        NIM = sc.nextLong();
        System.out.print("Kelas: ");
        kelas = sc.next();
        System.out.println("--- Mata Kuliah 1: Algoritma Dan Pemrograman ---");
        System.out.print("Nilai UTS: ");
        nilaiUTS1 = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        nilaiUAS1 = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        nilaiTugas1 = sc.nextDouble();
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS: ");
        nilaiUTS2 = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        nilaiUAS2 = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        nilaiTugas2 = sc.nextDouble();


        nilaiAkhir1 = (0.3 * nilaiTugas1) + (0.3 * nilaiUTS1) + (0.4 * nilaiUAS1);
        if (nilaiAkhir1 >= 80 && nilaiAkhir1 <= 100) {
            nilaiHuruf1 = "A";
            status1 = "Lulus";
        } else if (nilaiAkhir1 >= 73 && nilaiAkhir1 < 80) {
            nilaiHuruf1 = "B+";
            status1 = "Lulus";
        } else if (nilaiAkhir1 >= 65 && nilaiAkhir1 < 73) {
            nilaiHuruf1 = "B";
            status1 = "Lulus";
        } else if (nilaiAkhir1 >= 60 && nilaiAkhir1 < 65) {
            nilaiHuruf1 = "C+";
            status1 = "Lulus";
        } else if (nilaiAkhir1 >= 50 && nilaiAkhir1 < 60) {
            nilaiHuruf1 = "C";
            status1 = "Lulus";
        } else if (nilaiAkhir1 >= 39 && nilaiAkhir1 < 50) {
            nilaiHuruf1 = "D";
            status1 = "Tidak Lulus";
        } else if (nilaiAkhir1 >= 0 && nilaiAkhir1 < 39) {
            nilaiHuruf1 = "E";
            status1 = "Tidak Lulus";
        } else {
            nilaiHuruf1 = "I";
            status1 = "Tidak Ada Nilai";

            
        }
        nilaiAkhir2 = (0.3 * nilaiTugas2) + (0.3 * nilaiUTS2) + (0.4 * nilaiUAS2);
        if (nilaiAkhir2 >= 80 && nilaiAkhir2 <= 100) {
            nilaiHuruf2 = "A";
            status2 = "Lulus";
        } else if (nilaiAkhir2 >= 73 && nilaiAkhir2 < 80) {
            nilaiHuruf2 = "B+";
            status2 = "Lulus";
        } else if (nilaiAkhir2 >= 65 && nilaiAkhir2 < 73) {
            nilaiHuruf2 = "B";
            status2 = "Lulus";
        } else if (nilaiAkhir2 >= 60 && nilaiAkhir2 < 65) {
            nilaiHuruf2 = "C+";
            status2 = "Lulus";
        } else if (nilaiAkhir2 >= 50 && nilaiAkhir2 < 60) {
            nilaiHuruf2 = "C";
            status2 = "Lulus";
        } else if (nilaiAkhir2 >= 39 && nilaiAkhir2 < 50) {
            nilaiHuruf2 = "D";
            status2 = "Tidak Lulus";
        } else if (nilaiAkhir2 >= 0 && nilaiAkhir2 < 39) {
            nilaiHuruf2 = "E";
            status2 = "Tidak Lulus";
        } else {
            nilaiHuruf2 = "I";
            status2 = "Tidak Ada Nilai";
        }

        
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        System.out.println("================= HASIL PENILAIAN AKADEMIK =================");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Kelas: " + kelas);
        System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Dan Pemrograman\t%d\t%d\t%d\t%.2f\t\t%s\t\t%s\n", (int)nilaiUTS1, (int)nilaiUAS1, (int)nilaiTugas1, nilaiAkhir1, nilaiHuruf1, status1);
        System.out.printf("Struktur Data\t\t\t%d\t%d\t%d\t%.2f\t\t%s\t\t%s\n", (int)nilaiUTS2, (int)nilaiUAS2, (int)nilaiTugas2, nilaiAkhir2, nilaiHuruf2, status2);
        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rataRata);
         if (rataRata >= 70) {
            System.out.println("Status Semester: Lulus");
        } else {
            System.out.println("Status Semester: TIDAK LULUS (Rata rata < 70)");
        }

    }
}
