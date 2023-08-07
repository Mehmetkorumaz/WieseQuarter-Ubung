package day18_Whileloop_dowhileloop;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen rakamlar toplamini bulmak istediginiz sayiyi giriniz");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi= 0;
        int rakamlarToplami=0;

        while (sayi>0){

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }
        System.out.println("girilen "+girilenSayi+" nin rakamlar toplami : "+rakamlarToplami);

    }
}
