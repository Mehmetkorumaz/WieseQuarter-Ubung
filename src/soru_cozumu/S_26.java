package soru_cozumu;

import java.util.Scanner;

public class S_26 {
    public static void main(String[] args) {
        //Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
        //NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
        //Örnek:
        //Giriş :6
        //Çıkış: 6 Mükemmel Sayıdır
        //Giriş :7
        //Çıkış:7 Mükemmel Sayı Değildir
        //ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scanner.nextInt();
        int toplam=1;

        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        System.out.println("sayinin bolenler toplami : " + toplam);
        if (toplam == sayi) {
            System.out.println(sayi + "  mukemmel sayidir");
        } else {
            System.out.println(sayi + " mukemmel sayi degildir");
        }
    }
}
