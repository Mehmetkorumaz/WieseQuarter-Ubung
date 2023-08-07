package day11_string_manipulations;

import java.util.Scanner;

public class C02_length {
    public static void main(String[] args) {

        String isim = "Ramazan Uzunkavaklaraltindayataruyumazoglu";
        // son harfi yazdirin
        System.out.println("isim uzunlugu : "+isim.length());
        System.out.println("son harf : "+ isim.charAt(isim.length()-1));// u
        System.out.println("son harf : "+ isim.toUpperCase().charAt(isim.length()-1)); // U

        //sondan 5. harfi yazdirin
        System.out.println("son harf : "+ isim.charAt(isim.length()-5));// z

        // kullanicidan ismini alin
        // ve ortadaki harfi yazdirin
        // ismin uzunlugu cift sayi ise orta kisimdaki 2 harfi yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String ad = scan.nextLine();
        int uzunluk = ad.length();

        if (uzunluk%2==0){
            System.out.println("uzunluk cift ,ortadaki iki harf : "+ ad.charAt(uzunluk/2-1)+ad.charAt(uzunluk/2));
        }else{
            System.out.println("uzunluk tek, ortadaki harf : "+ ad.charAt((uzunluk-1)/2));
        }






    }
}
