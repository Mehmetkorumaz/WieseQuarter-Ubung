package day9_nested_ifelse_statements;

import java.util.Scanner;

public class c05_ternary {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        Scanner scan =new Scanner(System.in) ;
        System.out.println("lutfen 3 kenar uzunlugunu giriniz" );
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        System.out.println( kenar1==kenar2 && kenar3==kenar1 && kenar3>0 ? "eskenar ucgen" : "eskenar degil");
        // ifli yazilimida asagida
        if ( kenar1==kenar2 && kenar3==kenar1 && kenar3>0){
            System.out.println("eskenar ucgen");
        }else{
            System.out.println("eskenar ucgen degil");
        }
    }
}
