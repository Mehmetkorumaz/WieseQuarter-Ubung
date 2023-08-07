package String_manipulations;

import java.util.Scanner;

public class C02_soru {
    public static void main(String[] args) {
        // kullanicidan ismini alin
        // ve ortadaki harfi yazdirin
        // ismin uzunlugu cift sayi ise orta kisimdaki 2 harfi yazdirin
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String ad= scanner.nextLine();
        int uzunluk =ad.length();

        if (uzunluk%2==0){
            System.out.println(ad.charAt(uzunluk/2-1)+ "" +ad.charAt(uzunluk/2));
        }else {
            System.out.println(ad.charAt(uzunluk/2));
        }


    }
}
