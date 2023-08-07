package day03_scanner;

import java.util.Scanner;

public class c03_scanner {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        //         bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.printf("lutfen bir double sayi giriniz");
        double girilenDouble = scanner.nextDouble();
        System.out.printf("lutfen bir tam sayi giriniz");
        int girilenInt = scanner.nextInt();
        System.out.printf("ikisayinin toplami : "+ (girilenDouble +girilenInt));

        System.out.printf("ikisayinin carpimi : "+ girilenDouble *girilenInt);
    }
}
