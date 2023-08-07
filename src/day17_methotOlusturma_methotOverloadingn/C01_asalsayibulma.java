package day17_methotOlusturma_methotOverloadingn;

import java.util.Scanner;

public class C01_asalsayibulma {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        //olup olmadigini kontrol edip, sonuc olarak “true” veya “false”
        //sonuclarini donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Asal sayi kontrolu icin pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();
        boolean kytSayi=asalSayimi(sayi);//.... kayit etme islemi boyle yapilir
        System.out.println(asalSayimi(sayi));



    }
    public static boolean asalSayimi(int sayi){
        boolean flag= true;

        for (int i = 2; i < sayi; i++) {
            if(sayi%i==0)
            flag=false;
            break;
        }
        //        if (flag){ normalde boyle 2 ozel hale getirmek icin asagidaki gibi yazdik.
        //           return true;
        //        }else
        //           return false;

        if (sayi==2){
            return true;
        } else if (flag){
           return true;
        }else
           return false;

    }



}
