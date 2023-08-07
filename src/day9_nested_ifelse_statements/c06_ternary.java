package day9_nested_ifelse_statements;

import java.util.Scanner;

public class c06_ternary {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan= new Scanner(System.in);
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
        // ifli cozelim
        if (sayi1>sayi2){
            System.out.println(sayi2);
        }else{
            System.out.println(sayi1);
        }
    }
}
