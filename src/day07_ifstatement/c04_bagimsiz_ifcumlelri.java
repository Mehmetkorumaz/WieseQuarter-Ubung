package day07_ifstatement;

import java.util.Scanner;

public class c04_bagimsiz_ifcumlelri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int girilenSayi1 = scanner.nextInt();
        if (girilenSayi1%3==0) {
            System.out.println("girilrn sayi 3 e bolunebilen bir sayidir");
        }
        if (girilenSayi1%5==0){
            System.out.println("girilrn sayi 5 e bolunebilen bir sayidir");
        }

    }
}
