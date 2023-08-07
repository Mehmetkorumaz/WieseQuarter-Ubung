package soru_cozumu;

import java.util.Arrays;
import java.util.Scanner;

public class S_31 {
    public static void main(String[] args) {
        //Soru 31-)
        //Kullanıcıdan Arrayin uzunlugunu isteyin.
        //Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        //İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen olusturacaginiz array in elemen sayisini giriniz");
        int elementSayi= scanner.nextInt();

        int[]sayi=new int[elementSayi];
        for (int i = 0; i <sayi.length; i++) {
            System.out.println("lutfen elementleri giriniz");
            sayi[i]+= scanner.nextInt();
        }
        System.out.println(Arrays.toString(sayi));



    }
}
