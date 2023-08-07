package soru_cozumu;

import java.util.Scanner;

public class S_bey_14_soru {
    public static void main(String[] args) {
        //Soru 14-)
        //Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
        //Örnek:
        //char ch1=            'a'
        //String name =     "Ali bakkala geç gitti."
        //Beklenen Çıktı=    a sayısı = 3
        //Ipucu:
        //Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
        //Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen isim giriniz");
        String isim = scanner.nextLine();

        System.out.println("lutfen bir karakter giriniz");
        char karakter = scanner.next().charAt(0);
        int sayac1 = 0;
        int sayac2 = 0;
        while (sayac1 < isim.length()) {  //Bütün harfleri tek tek gezmesi icin
            if (karakter == isim.charAt(sayac1++)) { //aranan karaktere denk geldikce calisir
                sayac2++;
            }
        }
        System.out.println("Girdiginiz kelime icinde " + sayac2 + " adet " + karakter + " vardir");





       //for (int i = 0; i <isim.length() ; i++) {
       //    if (isim.next().charAt(i)==ch1){
       //        toplam++;

       //}
       //    System.out.println("girilen  "+karakter+"  cumle icinde "+toplam+" geciyor");


       // }


    }
}
