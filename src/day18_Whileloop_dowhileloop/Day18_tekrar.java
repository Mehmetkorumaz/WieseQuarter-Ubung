package day18_Whileloop_dowhileloop;

import java.util.Scanner;
public class Day18_tekrar {
    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere sayilar alin
        // girilen sayilarin toplami 500'u gecerse
        // bu kadar sayi yeter, girilen sayilarin toplami .... oldu yazdirin
        // girilen sayi adedi 10 veya daha yuksek olursa
        // 10'dan fazla sayi giremezsin, girilen sayilarin toplami .... oldu yazdirin
        // ve islemi bitirin
        Scanner scanner;
        int toplam=0;
        int sayi;
        int sayac=0;

        while (toplam<500 && sayac<10){
            scanner=new Scanner(System.in);
            System.out.println("lutfen toplanmak uzere sayilar giriniz");
            sayi= scanner.nextInt();
            toplam+=sayi;
            sayac++;
        }
        if (toplam>=500){
            System.out.println("bu kadar sayi yeter, girilen sayilarin toplami : "+toplam+"  oldu");
        }
        if (sayac>=10){
            System.out.println("10'dan fazla sayi giremezsin, girilen sayilarin toplami : "+toplam+" oldu");
        }



    }
}
