package day8_ifelseif_statements;

import java.util.Scanner;

public class c09_sorutekrar {
    public static void main(String[] args) {
        //- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen boyunuzu giriniz");
        double boy = scan.nextDouble();
        System.out.println("lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        double vke = kilo *10000 /(boy*boy);
        System.out.println("Vucut Kilo Endexi : "+vke);
        if (vke>=30 ){
            System.out.println("obez");
        }else if (vke>=25) {
            System.out.println("kilolu");
        } else if (vke>=20) {
            System.out.println("normal");

        }else {
            System.out.println("zayif");
        }


    }
}
