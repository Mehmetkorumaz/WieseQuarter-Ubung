package day07_ifstatement;

import java.util.Scanner;

public class c06_bagimsiz_ifcumleleri {
    public static void main(String[] args) {
        //kullanicidan bir pozitif tam sayi isteyiniz ,sayi 3 veya
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();
        if(girilenSayi%3==0||girilenSayi%5==0)
            System.out.println("guzel sayi");
    }
}
