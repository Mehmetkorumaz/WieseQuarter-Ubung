package soru_cozumu;

import java.util.Scanner;

public class S_24 {
    public static void main(String[] args) {
        //Soru 24-)
        //20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
        //Örnek:
        //100'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
        //ipucu:
        //Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scanner.nextInt();
        int sayi=girilenSayi;

        for (int i = 0; i <=20 ; i++) {
            if (i%2==0) {
                sayi =i;
                System.out.print(i+" " );



            }

        }

    }
}
