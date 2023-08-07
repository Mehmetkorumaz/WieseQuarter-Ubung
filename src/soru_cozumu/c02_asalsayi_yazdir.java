package soru_cozumu;

public class c02_asalsayi_yazdir {
    public static void main(String[] args) {
        // verilen bir pozitif bir tam sayinin
        // asalsayi mi olup aolmadigini yazdirin
        asalsayimiYazdir(34); //asalsayi degil
        asalsayimiYazdir(13);

    }
    public static void asalsayimiYazdir (int sayi){
        int sayac= 2;
        for (int i = 2; i < sayi; i++) {

            if (sayi%i==0)
            sayac=0;
            break;

        }
        if (sayac==0){
            System.out.println("sayi asalsayi degil");
        }else {
            System.out.println("sayi asalsayidir");
        }

    }


}
