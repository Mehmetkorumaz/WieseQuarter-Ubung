package day15_soru_socrative11;

import java.util.Scanner;

public class C04_nestedforloop_ucgen_yildiz {
    public static void main(String[] args) {
        /*
        Kullanicidan satir sayisi olarak bir rakam alin
        ve asagidaki gibi bir sekil cizdirin
        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir satir numarasi giriniz");
        int satir = scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*  ");

            }
            System.out.println("");

        }


    }
}
