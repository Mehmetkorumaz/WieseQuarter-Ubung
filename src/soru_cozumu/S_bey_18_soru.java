package soru_cozumu;

import java.util.Scanner;

public class S_bey_18_soru {
    public static void main(String[] args) {
        //Soru 18-) Method Sorusu
        //Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
        // Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        //İpucu:
        //yol=Hız*zaman
        Scanner scanner= new Scanner(System.in);
        System.out.print("lutfen yolun uzunlugunu km olarak giriniz :  ");
        double yol= scanner.nextDouble();

        System.out.print("lutfen yolu hangi Hiz ile  gidilecegini giriniz :  ");
        double hiz = scanner.nextDouble();
        System.out.println(varisSuresi(yol,hiz)+" saat te alirsiniz");

    }
   public static double varisSuresi(double yol,double hiz){
       double zaman= yol/hiz;
       return zaman ;
   }


}
