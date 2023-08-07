package day05_matemetikselislemler_incriment;

import java.util.Scanner;

public class c02_rakamtoplaminibulma {
    public static void main(String[] args) {
        // Kullanicidan 3 basamakli bir sayi alip
        // sayinin rakamlarini toplayip, yazdirin
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen 3 basamakli bir tam sayi giriniz");

        int girilenSayi = scanner.nextInt();

        int  birlerBasamagi = 0;
        int  rakamlarToplami = 0;
        // ilk sayi icin birler basamagini bulalim

        birlerBasamagi= girilenSayi%10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        // birler basamagindaki sayiyi aldik, artik ondan kurtulalim
        girilenSayi= girilenSayi/10;

        // Bu satira geldigimizde girilen sayiyi 2 basamakli hale donusturduk
        birlerBasamagi= girilenSayi%10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        girilenSayi = girilenSayi/10;

        // birler basamagindaki sayiyi aldik, artik ondan kurtulalim
        birlerBasamagi= girilenSayi%10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        girilenSayi = girilenSayi/10;

        System.out.println("rakamlar tolami : "+rakamlarToplami);



    }
}
