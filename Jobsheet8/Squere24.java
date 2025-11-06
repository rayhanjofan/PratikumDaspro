package Jobsheet8;

public class Squere24 {
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = scanner.nextInt();
        for (int iOuter = 1; iOuter <= n; iOuter++) {
        for (int i = 0; i <= n; i++) {
                System.out.print("*");
        }
        System.out.println();
    }
    }
}
