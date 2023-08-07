package day9_nested_ifelse_statements;

import java.util.Scanner;

public class c09_sorutekrari {
    public static void main(String[] args) {
        // kullanicidan bir pozitif tam sayi alin
        // sayini cift mi tek mi oldugunu yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi%2==0){
            System.out.println("cift sayi");
        }else {
            System.out.println("tek sayi");
        }
        System.out.println("===========================");
        System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");




    }
}
