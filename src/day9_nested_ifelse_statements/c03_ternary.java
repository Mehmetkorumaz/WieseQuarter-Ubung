package day9_nested_ifelse_statements;

import java.util.Scanner;

public class c03_ternary {
    public static void main(String[] args) {
        // kullanicidan bir pozitif tam sayi alin
        // sayini cift mi tek mi oldugunu yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scan.nextByte();
        if (girilenSayi%2==0 ){
            System.out.println("cift sayi");
        }else{
            System.out.println("tek sayi");
        }
       /*

        */

        System.out.println(girilenSayi%2==0 ? "cift sayi" : "tek sayi");// ternary kisalmali yazma
    }
}
