package soru_cozumu;

import java.util.Scanner;

public class S_11 {
    public static void main(String[] args) {
        //Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
        //                 Ad ve soyadın baş harfleri büyük olmalıdır
        //                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
        //                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.

        //Ipucu: IF ile çözebilirsiniz.
        //Giriş :
        //     > Gandalf Grey 563245879632
        //Çıktı :
        //     > İsim : G****** G***
        //     > CCN : **** **** 9632

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("lutfen soy isminizi giriniz");
        String soyIsim = scanner.nextLine();

        String ad= isim.substring(0,1).toUpperCase()+isim.substring(1).replace("//S","*");
        String soyad= soyIsim.toLowerCase();

    }



}
