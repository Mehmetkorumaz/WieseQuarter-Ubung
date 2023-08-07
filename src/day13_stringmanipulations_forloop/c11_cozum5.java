package day13_stringmanipulations_forloop;

import java.util.Locale;
import java.util.Scanner;

public class c11_cozum5 {
    public static void main(String[] args) {
        //Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi Giriniz");
        String isim =scan.nextLine();
        System.out.println("Lutfen isminizi Giriniz");
        String soyisim =scan.nextLine();
        int isimUzunluk=isim.length();
        int soyIsinUzunluk= soyisim.length();
        if (isimUzunluk>soyIsinUzunluk){

        } else if (isimUzunluk<soyIsinUzunluk) {
           soyisim= soyisim.toUpperCase();
            System.out.println();

        }


    }
}
