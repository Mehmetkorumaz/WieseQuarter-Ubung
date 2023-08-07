package soru_cozumu;

import java.util.Scanner;

public class S_bey_15_soru {
    public static void main(String[] args) {
     //Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın.
        // Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
        //  Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        //  Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
        //   Loopun içerisinde StringM methodlarından  yararlanalım!

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen en az 5 harften olusan bir kelime giriniz");
        String kelime = scanner.nextLine();

        int harfSayisi= kelime.length();

        while (harfSayisi<5){

            System.out.println("hatali giris!! ,lutfen en az 5 harften olusan bir kelime giriniz");
            kelime= scanner.next();
            harfSayisi= kelime.length();


            }

        String yeni = kelime.substring(kelime.length()-3);
        System.out.println("yeni kelime :  "+yeni+yeni);





    }
}
