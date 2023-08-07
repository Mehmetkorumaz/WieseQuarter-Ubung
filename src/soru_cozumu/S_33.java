package soru_cozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_33 {
    public static void main(String[] args) {
        //Soru 33-)
        //Array kullanarak String bir cümleyi Reverse eden (tersine çeviren)
        // bir Java programı yazın (boşluklar ve özel karakterler dahil).
        //Örnek:
        //String str=''Kodlama harika.''
        //String arr[]: ".etaerg si gnidoC"
        //İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın

        String arr= "Kodlama harika.";
        String[] taneli=arr.split("");
        System.out.println(Arrays.toString(taneli));
        //List<String> tersten=new ArrayList<>();
        String tersten="";

        for (int i = taneli.length-1; i >=0 ; i--) {
            tersten+=taneli[i];
        }
        System.out.println(tersten);
        String[] sonTersten=new String[1];
        sonTersten[0]=tersten;
        System.out.println(Arrays.toString(sonTersten));
    }
}
