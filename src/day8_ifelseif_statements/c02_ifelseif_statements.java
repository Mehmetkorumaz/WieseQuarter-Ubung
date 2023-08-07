package day8_ifelseif_statements;

import java.util.Scanner;

public class c02_ifelseif_statements {
    public static void main(String[] args) {
        // Kullanicidan bir tam sayi isteyin
        // Sayi 3' e bolunuyorsa 3'un kati
        // sayi 5'e bolunuyorsa 5'in kati
        // ikisine birden bolunuyorsa super sayi
        // ikisine de bolunmuyorsa yaramaz sayi yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();
        if (girilenSayi%3==0 && girilenSayi%5==0){
            System.out.println("super sayi");
        } else if (girilenSayi%3==0 ) {
            System.out.println( "Girilen Sayi 3 un katidir");

        }else if (girilenSayi%5==0 ) {
            System.out.println("Girilen sayi 5 in katidir");
        }else {
            System.out.println("yaramaz sayi");
        }
    }
}
