package day18_Whileloop_dowhileloop;

import java.util.Scanner;

public class C05_usHesaplama {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //        While loop kullanarak verilen sayinin istenen ussunu hesaplayip
        //        yazdiran bir method olusturun.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen ussu hesaplanacak pozitif bir sayi giriniz");
        double sayi = scanner.nextDouble();

        System.out.println("lutfen hesaplanacak sayi icin us griniz");
        int us= scanner.nextInt();

        usHesaplama(sayi,us);
    }
    public static void usHesaplama(double sayi , int us){
        double sonuc =1;

        while (us>0){
            sonuc*=sayi;
            us--;
        }
        System.out.println("sonuc : "+sonuc);
    }

}
