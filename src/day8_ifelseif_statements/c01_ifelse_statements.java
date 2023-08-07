package day8_ifelseif_statements;

import java.util.Scanner;

public class c01_ifelse_statements {
    public static void main(String[] args) {
        //- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char harf = scan.next().charAt(0);

        if ( harf >='A' &&  harf <='Z' ){
            System.out.println("sectiginiz karakter buyuk harf");
        }else {
            System.out.println("sectiginiz karakter buyuk harf degil");
        }



    }
}
