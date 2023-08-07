package day07_ifstatement;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class c07_ifelse_statement {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double girilenNot = scan.nextDouble();
        if(girilenNot>= 50 ){
            System.out.println("sinifi gectiniz");
            if(girilenNot< 50 ) System.out.println("malesef kaldiniz");
        }
        if(girilenNot>= 50){
            System.out.println("sinifi gectiniz");
        }else{ System.out.println("malesef kaldiniz");

        }

    }
}
