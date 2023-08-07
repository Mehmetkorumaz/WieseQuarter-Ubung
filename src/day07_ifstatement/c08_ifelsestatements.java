package day07_ifstatement;

import java.util.Scanner;

public class c08_ifelsestatements {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 kenar uzunlugunu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        if (kenar1==kenar2&&kenar1==kenar3){

            System.out.printf("eskenar ucgendir");
        }else{
            System.out.println("eskenar ucgen degildir");
        }
    }
}
