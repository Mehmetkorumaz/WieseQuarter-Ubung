package soru_cozumu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S_35 {
    public static void main(String[] args) {
        //Soru 35-)
        //Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
        //		--> toCharArray() yöntemini kullanmayın
        //Örnek:
        //		String isim:    Yakup
        //		char arr[]:     [Y,a,k,u,p]
        //İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
        // Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String ad = scanner.nextLine();
        ismiParcala(ad);


    }
    public static void ismiParcala(String ad){
        String[] parcaliIsim= ad.split("");
        System.out.println(Arrays.toString(parcaliIsim));

        //2. yol
        //char[] harfler = new char[isim.length()];
        //        for (int i = 0; i < harfler.length; i++) {
        //            harfler[i] = isim.charAt(i);
        //        }
        //        System.out.println("Harflerine ayrilmis isim: " + Arrays.toString(harfler));
        //        return  harfler;
    }
}
