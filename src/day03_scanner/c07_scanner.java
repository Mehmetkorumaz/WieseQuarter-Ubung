package day03_scanner;

import java.util.Scanner;

public class c07_scanner {
    public static void main(String[] args) {
        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
Scanner scanner = new Scanner(System.in);
        System.out.printf("lutfen ilk sayiyi giriniz");
        int ilkSayi = scanner.nextInt();
        System.out.printf("lutfen ikinci sayiyi giriniz");
        int ikinciSayi = scanner.nextInt();
        int temp = ilkSayi;
        ilkSayi = ikinciSayi;
        ikinciSayi = temp;
        System.out.printf("ilk sayinin yeni degeri : "+ilkSayi);
        System.out.printf("\nikinci sayinin yeni degeri : "+ikinciSayi);

    }
}
