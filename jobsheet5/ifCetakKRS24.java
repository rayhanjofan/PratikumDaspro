package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS24 {
    public static void main(String[] args) {
       Scanner  sc = new Scanner(System.in);
       System.out.println("---Cetak KRS---");
       System.out.println("Apakah UKT sudah lunas? (true/false)");
         boolean uktLunas = sc.nextBoolean();

             String status = uktLunas ? "Pembayaran UKT terverifikasi.\nSilahkan cetak KRS dan minta tanda tangan DPA." : "Pembayaran UKT belum lunas, KRS tidak bisa dicetak.";
        System.out.println(status);
    }   
    }   

