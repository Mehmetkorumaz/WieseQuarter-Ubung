package day17_methotOlusturma_methotOverloadingn;

import java.util.Scanner;

public class C02_tamBolenler_sayisi {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun
        //   ornek : 20  pozitif tam bolenleri : 1,2,4,5,10,20   ptbs : 6

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        System.out.println(tamBolenlersayisi(sayi));

    }
    public static int tamBolenlersayisi(int sayi){
        int sayac=0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
                sayac++;

            }

        }
        return sayac;
    }
}
