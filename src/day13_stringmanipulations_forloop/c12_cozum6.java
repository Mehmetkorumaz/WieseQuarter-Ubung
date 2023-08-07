package day13_stringmanipulations_forloop;

import java.util.Scanner;

public class c12_cozum6 {
    public static void main(String[] args) {
        //: Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir Metin Giriniz");
        String metin =scan.nextLine();
        int uzunluk = metin.length();
        if (uzunluk%2==0) {
            System.out.println("uzunluk cift : " + (metin.substring(uzunluk/2-1))+":)");
        }else {

        }
    }
}
