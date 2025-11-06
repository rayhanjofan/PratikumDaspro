package Jobsheet8;

public class Tugas1 {
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = scanner.nextInt();

        int i = 1;
        int jumlahKuadrat = 0;
        String detailPenjumlahan = "";
        while (i <= n) {
            jumlahKuadrat += i * i;
            if (i == 1) {
                detailPenjumlahan = "" + (i * i);
                System.out.println("n = " + i + " = jumlah kuadrat = " + detailPenjumlahan);
            } else {
                detailPenjumlahan += " + " + (i * i);
                System.out.println("n = " + i + " = jumlah kuadrat = " + detailPenjumlahan + " = " + jumlahKuadrat);
            }
            i++;
        }
    }
}
