package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class day21_tekrar {
    public static void main(String[] args) {
        // Soru 6- Verilen String bir array’deki
        //         en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        String[] isimler = {"Resul","Omer","Mehmet","Ertugrul","Ozan","Suleyman"};
       arrayOlusturma(isimler);
    }
    public static void arrayOlusturma(String[] isimler){
      String enUzunIsim= isimler[0];
      String enKisaIsim= isimler[0];
        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].length()> enUzunIsim.length()){
                enUzunIsim=isimler[i];
            }
            if (isimler[i].length()< enKisaIsim.length()){
                enKisaIsim=isimler[i];
            }
        }
        System.out.println("en kisa isim : " +enKisaIsim+ "\n en uzun isim : "+enUzunIsim);


    }
}
