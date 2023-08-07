package soru_cozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_30 {
    public static void main(String[] args) {
        //Soru 30-)
        //Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        //( mülakat sorusu )
        //Örnek:
        //String str="Javacokkolay"
        //Yinelenen karakterler : [a, o, k]
        //İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.

        String str="Javacokkolay";
        //String[] kelime =  str.split("");
        char[] kelime=str.toCharArray();
        System.out.println(Arrays.toString(kelime));

        String ayniHarf="";
        int sayac=0;

        for (int i = 0; i < kelime.length ; i++) {
            for (int j = 0; j < kelime.length; j++) {
                if (kelime[i]==kelime[j])

                sayac++;
            }
            if (sayac>0 && ayniHarf.indexOf(kelime[i])<0){
                ayniHarf=ayniHarf+kelime[i];
            }
            System.out.println(ayniHarf);
        }




    }
}
