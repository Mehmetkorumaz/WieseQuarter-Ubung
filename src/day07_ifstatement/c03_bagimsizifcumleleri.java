package day07_ifstatement;

import java.util.Scanner;

public class c03_bagimsizifcumleleri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();
        if(girilenSayi%5==0){
            System.out.println("girilen sayi 5 bolunebilir");
        }



    }
}
