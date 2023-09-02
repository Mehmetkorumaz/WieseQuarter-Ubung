package day41_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class deneme2 {
    // kullanicidan 2 tamsayi alip, ilksayiyi ikinci sayiya bölün ,
    // tam sayi girmezse hatamesaji verip tekrar sayi isteyin(olabilecek butun hatalari dusunup cozun)
    //ve sonucun tamsayi kismini yazdirin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sayiiste = true;
        int sayi1 = 0;
        while (sayiiste) {
            try {
                System.out.println("lütfen bölünecek sayiyi giriniz");
                sayi1 = scanner.nextInt();
                sayiiste = false;
            } catch (InputMismatchException e) {
                String temp = scanner.next();
                System.out.println("bir tam sayi girmelisiniz");
            }
        }

        sayiiste=true;
        int sayi2 = 0;
        while (sayiiste) {
            try {
                scanner=new Scanner(System.in);
                System.out.println("lütfen bölcek sayi giriniz");
                sayi2 = scanner.nextInt();
                sayiiste = false;
            } catch (InputMismatchException e) {
                String temp = scanner.next();
                System.out.println("bir tam sayi girmelisiniz");
            }
        }
        try {
            System.out.println("sonuc : " + sayi1 / sayi2); //try- exception olusmasi muhtemel kisim
        } catch (ArithmeticException e) { //keywort ve beklenen exceptionturu
            System.out.println("sayi 0 a bolunemez");
        }


    }
}