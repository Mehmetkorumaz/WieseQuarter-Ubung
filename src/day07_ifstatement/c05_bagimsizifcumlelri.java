package day07_ifstatement;

import java.util.Scanner;

public class c05_bagimsizifcumlelri {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        /*
       Jawa
         */
        if(kenar1==kenar2&&kenar1==kenar3&&kenar1>0){
            System.out.println("eskenar ucgendir");
        }



    }
}
