package day8_ifelseif_statements;

import java.util.Scanner;

public class soru02_soruifelseif_statements {
    public static void main(String[] args) {
        // kullanicidan bir tam sayi alin
        // sayi 3 ile bolunuyorsa "Uc ile bolunebilen sayi"
        // 5 ile bolunebiliyorsa "bes ile bolunebilen sayi"
        // hem 3 hem 5 ile bolunebiliyorsa "super sayi" yazdirsin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();
        if (girilenSayi%3==0&& girilenSayi%5==0){
            System.out.println("super sayi");
        } else if (girilenSayi%5==0){
            System.out.println(" 5 e bolunene bilen sayi");
        } else if (girilenSayi%3==0) {
            System.out.println("3 e bolune bilen sayi");
        }

    }
}
