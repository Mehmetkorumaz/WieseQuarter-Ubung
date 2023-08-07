package day16_method_olusturVeKullanma;

import java.util.Scanner;

public class C03_methot_olusturma {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan main method icinde  ayri ayri isim ve soyismini alin
        //        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //        isim bosluk soyisim seklinde bize donduren bir method olusturun
        //        input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.next();

        System.out.println("lutfen soyisminizi giriniz");
        String soyIsim= scan.next();

        //  direk dondurulen sonucu yazdirma islemi
        System.out.println(isimDuzenleme(isim,soyIsim));

        // istersek de ilerde kullanmak uzere kaydedebiliriz---- KAYDETME ISLEMI---
        String duzenliIsim= isimDuzenleme(isim,soyIsim);

    }
    public static String isimDuzenleme( String isim,String soyisim){
     isim= isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
     soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        String istenenFormattaIsimSoyisim= isim+" "+soyisim;
        return istenenFormattaIsimSoyisim;
    }
}
