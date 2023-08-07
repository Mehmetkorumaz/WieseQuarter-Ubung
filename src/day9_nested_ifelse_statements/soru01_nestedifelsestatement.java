package day9_nested_ifelse_statements;

import java.util.Scanner;

public class soru01_nestedifelsestatement {
    public static void main(String[] args) {
           /*
          Ornegin : Kullanicidan cinsiyetini ve yasini alin,
          Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
          Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
          veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");
        String cinsiyet = scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        double yas= scan.nextDouble();
        if (cinsiyet.equalsIgnoreCase("kadin")){
            if(yas<90&&yas<0) {
                System.out.println("yas girisi gecersiz");
            } else if (yas<60) {
                System.out.println("emekliliginize " +(60-yas)+" kalmistir");

            }else{
                System.out.println("emekli olablirsiniz");

            }
        } else if (cinsiyet.equalsIgnoreCase("erkek")) {
            if(yas>90&&yas<0) {
                System.out.println("yas girisi gecersiz");
            } else if (yas<65) {
                System.out.println("emekliliginize " +(65-yas)+" yil kalmistir");

            }else{
                System.out.println("emekli olablirsiniz");
        }


        }else {
            System.out.println("gecersiz cinsiyet");
        }


    }
}
