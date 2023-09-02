package day41_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class deneme_soru {
    // kullanicidan 2 tamsayi alip, ilksayiyi ikinci sayiya bölün ,
    //ve sonucun tamsayi kismini yazdirin


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen bölünecek sayiyi giriniz");
        int sayi1= 0;
        try {
            sayi1 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("lütfen bir tam sayi giriniz");
        }

        System.out.println("lütfen bolcek sayiyi giriniz");
        int sayi2= 0;
        try {
            sayi2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("lütfen bir tam sayi giriniz");
        }

        try {
            System.out.println("sonuc : "+sayi1/sayi2); //try- exception olusmasi muhtemel kisim
        } catch (ArithmeticException e) { //keywort ve beklenen exceptionturu
            System.out.println("sayi 0 a bolunemez");
        }


       //if (sayi2==0){
       //    System.out.println("sayi 0 a bolunemez");
       //}else{
       //    System.out.println("sonuc : "+sayi1/sayi2);
       //}
    }
}
