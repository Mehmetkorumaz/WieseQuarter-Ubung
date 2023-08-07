package day16_method_olusturVeKullanma;

import java.util.Scanner;

public class C05_dondurme_sorucozumu {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        //sonuclarini donduren bir method olusturun.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi girini");
        int girilenSayi = scan.nextInt();
C05_dondurme_sorucozumu.asalSayiTesbiti(girilenSayi);

    }

    public static int asalSayiTesbiti(int sayi) {
        int sayac = 2;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac = 0;
                break;

            }


        }
        if (sayac == 0) {
            System.out.println("sayi asalsayi");
        } else {
            System.out.println("sayi asalsayi degil");


        }
        return sayac;

    }
}