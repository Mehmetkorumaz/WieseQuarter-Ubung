package day13_stringmanipulations_forloop;

import java.util.Scanner;

public class c09_soru_cozum3 {
    public static void main(String[] args) {
        //Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Metin Giriniz");
        String input =scan.nextLine();
        input=input.replaceAll("\\d", "");
        System.out.println(input);
        input=input.replaceAll("\\s+","1");
        input=input.replaceAll("\\W+","");
        input=input.replaceAll("1"," ");
        input=input.toLowerCase();
        input=input.replaceAll("j","J");

        System.out.println(input+".");


    }
}
