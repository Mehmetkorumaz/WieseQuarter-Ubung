package soru_cozumu;

public class c03_mini_hesapmakinasi_methot_dondur {
    public static void main(String[] args) {
       miniHesapmakinasi(3, 6, '*');

        System.out.println(miniHesapmakinasi(3, 6, '*'));// yazdirma islemi
        double sonuc= miniHesapmakinasi(3, 6, '*');


    }
    public static double miniHesapmakinasi(int sayi1,int sayi2,char islemSembolu){
        double sonuc =0;
        switch (islemSembolu){
            case '+':
                sonuc=sayi1+sayi2;
                break;
            case '*':
                sonuc=sayi1*sayi2;
                break;
            case '-':
                sonuc=sayi1-sayi2;
                break;
            case '/':
                sonuc=sayi1/sayi2;
                break;
            default:
                System.out.println("islem sembolu yanlis girildi,sonuc 0" );
        }
        return sonuc;
    }
}
