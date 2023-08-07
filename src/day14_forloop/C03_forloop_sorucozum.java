package day14_forloop;

import java.util.Scanner;

public class C03_forloop_sorucozum {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir baslangic sayisi giriniz");
        int baslangicSayisi= scan.nextInt();

        System.out.println("lutfen bir bitis sayisi giriniz");
        int bitisSayisi= scan.nextInt();

        int rakamlarToplami= 0;
        if (baslangicSayisi<bitisSayisi){
            for (int i = baslangicSayisi; i <=bitisSayisi; i++) {
                rakamlarToplami+=i;
            }
        }else {
            for (int i = bitisSayisi; i <=baslangicSayisi ; i++) {
                rakamlarToplami+=i;

            }
        }
        System.out.println("rakamlar Toplami : "+ rakamlarToplami);

    }
}
