package day8_ifelseif_statements;

import java.util.Scanner;

public class soru03_ifelseif_statements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not = scan.nextDouble();
        if (not>100 || not<0) {
            System.out.println("gecersiz not");
        }else if (not>=85){
            System.out.println("AA");
        } else if (not>=65) {
            System.out.println("BB");
        } else if (not>=50) {
            System.out.println("CC");
            }else {
            System.out.println("DD");

        }
    }
}
