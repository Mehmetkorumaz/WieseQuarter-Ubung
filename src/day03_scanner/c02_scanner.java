package day03_scanner;

import java.util.Scanner;

public class c02_scanner {
    public static void main(String[] args) {
        // Kullanicidan bir tamsayi alip, karesini yazdirin
        // Sccanner ile kullanicidan bir bilgiyi 3 adimda alabiliriz
        // 1.adim : scanner objesi olusturmak
        Scanner scanner = new Scanner(System.in);
        // 2.adim : Kullaniciya ne istediginizi soyleyin
        System.out.printf("lutfen bir tam sayi giriniz");
        // 3.adim istediginiz datanin turune uygun bir variable olusturun
        // ve scanner objesini kullanark uygun method'la kullanicinin girdigi degeri alin
        int girilenSayi = scanner.nextInt();
        System.out.printf("girilen sayinin karesi : "+girilenSayi*girilenSayi);
    }
}
