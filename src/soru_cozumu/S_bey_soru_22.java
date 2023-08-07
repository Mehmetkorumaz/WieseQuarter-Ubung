package soru_cozumu;

import java.util.Scanner;

public class S_bey_soru_22 {
    public static void main(String[] args) {
        //Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        //Giriş :
        //30 ve 40
        //
        //Beklenen Çıktı:
        //30 ve 40 için EBOB= 10
        //30 ve 40 için EKOK= 120
        //ipucu:
        //Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen pozitif iki sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayac = 0;
        int limitEbob = 0;
        if (sayi1 < sayi2) {
            limitEbob = sayi1;
        } else {
            limitEbob = sayi2;
        }
        int ebob = 1;

        for (int i = limitEbob; i >= 2; i--) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                System.out.println("sayilarinin ebob degeri : "+i);
                int ekok = (sayi1*sayi2)/i;
                System.out.println("sayilarin ekok degeri : "+ekok); // ekok degeri ni burada hesaplaya biliriz
                                                                     //ayrica asagidada var
                sayac++;
                break;
            }
        }
        if (sayac==0){
            System.out.println("iki sayini ortak boleni yoktur");
        }

        sayac=0;

        for (int i = 1; i <= (sayi1*sayi2); i++) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                System.out.println("sayilarinin ekok degeri : " + i);
                sayac++;
                break;
            }
        }

    }
}