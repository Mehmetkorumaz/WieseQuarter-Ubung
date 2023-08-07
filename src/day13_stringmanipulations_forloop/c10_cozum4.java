package day13_stringmanipulations_forloop;

import java.util.Scanner;

public class c10_cozum4 {
    public static void main(String[] args) {
    //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk harf kucuk harf,son karakter rakam,bosluk icermeyen,en az 10 karakter icern bir sifre giriniz ");
        String sifre =scan.nextLine();
        int uzunluk =sifre.length();
        char ilkHarf = sifre.charAt(0);
        char sonKrakter= sifre.charAt(uzunluk-1);
        boolean flag= true;
        if (!(ilkHarf>='a'&& ilkHarf<='z')) {
            System.out.println("ilk karakter kucuk harf olmalidir");
            flag=false;
        }
        if (!(sonKrakter<='9' && sonKrakter>= '0' )) {
            System.out.println("lutfen son karakteri rakam giriniz");
            flag=false;
        }
        if (sifre.contains(" ")) {
            System.out.println("sifre space karakteri icermemeli");
            flag=false;
        }
        if (!(uzunluk>=10)) {
            System.out.println("sifre en az 10 kareakter olmali");
            flag=false;
        }
        if (flag)
                System.out.println("sifreniz basariyla kaydedilmistir");
            }

    }



