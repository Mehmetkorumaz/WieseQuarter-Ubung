package day18_Whileloop_dowhileloop;

import java.util.Scanner;

public class C02_girilrnSayilarToplami {
    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere sayilar alin
        // girilen sayilarin toplami 500'u gecerse
        // bu kadar sayi yeter, girilen sayilarin toplami .... oldu yazdirin
        // girilen sayi adedi 10 veya daha yuksek olursa
        // 10'dan fazla sayi giremezsin, girilen sayilarin toplami .... oldu yazdirin
        // ve islemi bitirin

        Scanner scanner;
        int sayac=0;
        int toplam=0;
        int sayi;

        while (sayac<=10 && toplam<=500){
            scanner=new Scanner(System.in);
            System.out.println("lutfen toplanmak uzere sayilar giriniz");
            sayi=scanner.nextInt();
            toplam+=sayi;
            sayac++;

        }

        if (sayac>=10){
            System.out.println("10'dan fazla sayi giremezsin, girilen sayilarin toplami "+ toplam+" oldu");
        }
        if (toplam>=500){
            System.out.println("bu kadar sayi yeter, girilen sayilarin toplami  "+toplam+"  oldu");

        }





    }
}
