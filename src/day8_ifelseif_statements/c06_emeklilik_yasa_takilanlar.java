package day8_ifelseif_statements;

import java.util.Scanner;

public class c06_emeklilik_yasa_takilanlar {
    public static void main(String[] args) {
        //- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz E : Erkek , K: Kadin");
        char cinsiyet =scan.next().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        if (cinsiyet=='E'&& yas>=65){
            System.out.println("erkek emekli olabilir");
        } else if (cinsiyet=='E'&& yas<65) {
            System.out.println("erkek emekli olamaz "+ (65-yas)+" yil daha calismalisiniz");

        } else if (cinsiyet=='K'&& yas>=60) {
            System.out.println("kadin emekli olabilir");
        }else if (cinsiyet=='K'&& yas<60){
            System.out.println("erkek emekli olamaz "+ (60-yas)+" yil daha calismalisiniz");

        }
        }
    }

