package soru_cozumu;

import java.util.Scanner;

public class S_28 {
    public static void main(String[] args) {
       //Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        //Örnek:
        //      Sayı: 1238
        //      Sayının Tersi: 8321
        //İpucu:  Loop kullanabilirsiniz

        Scanner scanner=new Scanner(System.in);
        System.out.print("lutfen pozitif bir tam sayi giriniz : ");
        int girilenSayi= scanner.nextInt();
        int birlerBasamagi =0;
        int uzunluk =(girilenSayi+" ").length();
        int de=girilenSayi%10;

        while (girilenSayi>0){
            System.out.print(girilenSayi%10);
            girilenSayi/=10;
        }

    }
}
