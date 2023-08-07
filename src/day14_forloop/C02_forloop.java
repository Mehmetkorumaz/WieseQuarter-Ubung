package day14_forloop;

import java.util.Scanner;

public class C02_forloop {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen baslangic icin bir sayi giriniz");
        int baslangicSayisi= scan.nextInt();

        System.out.println("lutfen bir bitis sayisi giriniz");
        int bitisSayisi = scan.nextInt();
        if (bitisSayisi<baslangicSayisi){
            System.out.println("bitis sayisi baslangic sayisindan kucuk olamaz");
        }else {
            int sayiToplami= 0;
            for (int i = baslangicSayisi; i <=bitisSayisi ; i++) {
                sayiToplami+=i;

            }
            System.out.println("baslangic ve bitis arasi sayilarin toplami : "+sayiToplami );
        }


    }
}
