package day14_forloop;

import java.util.Scanner;

public class C01_sifredegistirme {
    public static void main(String[] args) {
        //Soru 4 : main methot da Kullanicidan bir sifre isteyip,
        // olusturacagimiz methotta asagidaki sartlari kontrol edin
        //  ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // tum sartlari saglanincaya kadar tekrar deger isteyin
        // ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali
        altString("Java guzeldir",3,7); //a gu
        altString("Biraz sabir lutfen",5,4);
        // Baslangic index'i bitis index'inden buyuk olamaz
        altString("Bu da mi gol degil ?" , 11,33);
        //verilen index sinirlarin disinda
        String str= "Aramiz bozulmasin";
        altString(str,5,10); // z boz
    }

    public static void altString(String metin, int basIndex, int bitIndex ){
        if (basIndex>bitIndex){
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else if (basIndex>=metin.length() || bitIndex>=metin.length()) {
            System.out.println("verilen index sinirlarin disinda");
        }else{
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");
    }
}
