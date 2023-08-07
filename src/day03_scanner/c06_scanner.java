package day03_scanner;

import java.util.Scanner;

public class c06_scanner {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan bir cemberin yaricapini alip,
        //         cevresini ve alanini yazdirin.
       // Scanner scanner = new Scanner(System.in);
        //System.out.printf("lutfen cemberin yaricapini giriniz");
        //double girilenYaricap = scanner.nextDouble();
        //System.out.printf("cemberin cevresi : "+girilenYaricap+2+3,14);
        //System.out.printf("\ndairenin alani : "+girilenYaricap*girilenYaricap*3,14);
        // kullanicidan bir kelime isteyip kelimenin ilk harfini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
         char ilkHarf = scan.next().charAt(0);
        System.out.println("kelimenin bas harfi : "+ilkHarf );
    }
}
