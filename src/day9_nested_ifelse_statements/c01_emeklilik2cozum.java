package day9_nested_ifelse_statements;

import java.util.Scanner;

public class c01_emeklilik2cozum {
    public static void main(String[] args) {
        //- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz E : Erkek , K: Kadin");
        char cinsiyet =scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        if (yas<10 && yas>80){
            System.out.println("gecersiz yas");

        }else if(yas <60){ // kimse emekli olamaz
            if (cinsiyet=='E'){
                System.out.println("emekli olamak icin daha " +(65-yas)+"calismaniz gerekiyor");
            } else if (cinsiyet=='K') {
                System.out.println("emekli olmak icin daha "+(60-yas)+"calismaniz gerekiyor");
            }else {
                System.out.println("cinsiyet girisi hatali");
            }

        }else if (yas<65 ){
            if (cinsiyet=='E'){
                System.out.println("emekli olamak icin daha " +(65-yas)+" calismaniz gerekiyor");
            } else if (cinsiyet=='K') {
                System.out.println("emekli olmak icin daha "+(60-yas)+" calismaniz gerekiyor");

            }else {
                System.out.println("cinsiyet girisi hatali");
            }


        }else{
            if (cinsiyet=='E'|| cinsiyet=='K')
            System.out.println("emekli olabilirsiniz");
            //herkes emekli olabilir
            else {
                System.out.println("cinsiyet girisi hatali");
            }
        }

    }
}
