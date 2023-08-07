package day14_forloop;

import java.util.Scanner;

public class C05_rakamlarToplami {
    public static void main(String[] args) {
        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();
        int sayi= girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami= 0;
        int uzunluk = (sayi+"").length();
        for (int i = 0; i <=uzunluk; i++) {
            birlerBasamagi=sayi % 10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }
        System.out.println("girilen sayinin  "+girilenSayi+"  rakamlar toplami : "+rakamlarToplami);


    }
}
