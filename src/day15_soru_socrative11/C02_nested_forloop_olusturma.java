package day15_soru_socrative11;

import java.util.Scanner;

public class C02_nested_forloop_olusturma {
    public static void main(String[] args) {
        /*
            Kullanicidan 2 rakam alin
            ilk rakan satir
            ikinci rakam sutun olmak uzere asagidaki sekli cizdirin
            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir satir numarasi giriniz");
        int satir = scan.nextInt();

        System.out.println("lutfen bir sutun numarasi giriniz");
        int sutun = scan.nextInt();
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun; j++) {
                System.out.print("*  ");

            }
            System.out.println("");

        }

    }
}
