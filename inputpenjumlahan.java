import java.util.Scanner;

public class inputpenjumlahan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nomor,nomor2,hasil;

        System.out.println("Bilangan 1:");
        nomor = in.nextInt();
        System.out.print("Bilangan 1:");
        nomor2 = in.nextInt();

        hasil = nomor + nomor2;
        System.out.println("hasil pemjumlahan: "+ hasil);
     }
    }