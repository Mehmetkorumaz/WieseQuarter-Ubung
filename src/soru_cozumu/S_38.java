package soru_cozumu;

import java.util.Arrays;

public class S_38 {
    //Soru-39)
    //Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren bir method yazın
    // ve ardından sonucu main methodda yazdırın.
    //Örn:
    //girdi : {1,2,3,4,5,6,7,8}
    //çıkış: 36
    //ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
    public static void main(String[] args) {
        int[] sayi= {1,2,3,4,5,6,7,8};
        System.out.println(Sayitoplam(sayi));
    }
    public static int Sayitoplam (int[] sayi ){

        int toplam =0;
        for (int i = 0; i < sayi.length; i++) {
            toplam+=sayi[i];
        }
        return toplam;
    }

}
