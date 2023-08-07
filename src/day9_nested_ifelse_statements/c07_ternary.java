package day9_nested_ifelse_statements;

import java.util.Scanner;

public class c07_ternary {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();
        System.out.println(sayi>0 ? sayi : -1*sayi);
        //if li cozelim
        if (sayi>0){
            System.out.println(sayi);
        }else {
            System.out.println(-1*sayi);
        }

    }
}
