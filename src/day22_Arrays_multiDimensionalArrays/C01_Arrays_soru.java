package day22_Arrays_multiDimensionalArrays;

public class C01_Arrays_soru {
    public static void main(String[] args) {
        String[] isimler ={"ayse","Yusuf","Bugra","Abdullah","nergiz"};
        // verilen bir array'deki uzunlugu tek sayi olan isimleri
        // yan yana aralarinda bir bosluk birakarak yazdirin
        // en sonda alt satira gecerek toplam kac isim yazdirildigini yazdirin

        int sayac=0;
        int uzunluk =0;
        for (int i = 0; i < isimler.length; i++) {
            uzunluk= isimler[i].length();
            if (uzunluk%2!=0){
                System.out.println(isimler[i]+" ");
                sayac++;
            }
        }
        System.out.println(sayac+" adet isim yazdirildi");
    }
}
