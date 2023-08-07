package day21_Arrays_2.cozumlr;

import java.util.Scanner;

public class C04_ElementSay {
    public static void main(String[] args) {
        int[] arr={3,5,2,3,5,6,7,1,8};
        System.out.print("lutfen Array icerisinde Aradiginiz sayiyi giriniz  :  ");
        Scanner scanner=new Scanner(System.in);
        int arananSayi= scanner.nextInt();

        int sayac =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananSayi){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("aranan sayi Array de yok");
        }else {
            System.out.println("aranan "+arananSayi+" Array de "+sayac+" adet bulunmaktadir");
        }


    }
}
