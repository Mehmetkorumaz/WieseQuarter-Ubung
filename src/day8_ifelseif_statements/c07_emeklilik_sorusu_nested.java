package day8_ifelseif_statements;

import java.util.Scanner;

public class c07_emeklilik_sorusu_nested {
    public static void main(String[] args) {
        //- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz E : Erkek , K: Kadin");
        char cinsiyet =scan.next().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if(cinsiyet== 'E'){
            if(yas<0 && yas >90){
                System.out.println("Gecersiz yas");
            } else if (yas>=65) {
                System.out.println("Emekli olabilirsiniz(erkek)");
            }else{
                System.out.println("emekli olamaz daha  "+(65-yas)+" calismaniz gerekli");
            }


        }else if (cinsiyet== 'K'){
            if(yas<0 && yas >90){
                System.out.println("Gecersiz yas");
            }else if (yas >=60){
                System.out.println("emekli olabilirsiniz");
            }else {
                System.out.println("emekli olmak icin daha" +(60-yas)+ "calismaniz gerekli");
            }


        }else {
            System.out.println("Cinsiyet Hatali Girildi");
        }




    }
}
