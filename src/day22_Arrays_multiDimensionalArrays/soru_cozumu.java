package day22_Arrays_multiDimensionalArrays;

public class soru_cozumu {
    public static void main(String[] args) {
        String[] isimler ={"ayse","Yusuf","Bugra","Abdullah","nergiz"};
        // verilen bir array'deki uzunlugu tek sayi olan isimleri
        // yan yana aralarinda bir bosluk birakarak yazdirin
        // en sonda alt satira gecerek toplam kac isim yazdirildigini yazdirin
        String toplam="";
        int sayac=0;

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length()%2 ==1){
                System.out.println(isimler[i]+" ");
                sayac++;
            }
        }
        System.out.println( sayac+" adet isim yazdirildi");

    }

}