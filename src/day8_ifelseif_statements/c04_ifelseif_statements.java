package day8_ifelseif_statements;

import java.util.Scanner;

public class c04_ifelseif_statements {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi isteyin
        // Sayi 3' e bolunuyorsa 3'un kati
        // sayi 5'e bolunuyorsa 5'in kati
        // ikisine birden bolunuyorsa super sayi
       Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%3==0 && sayi%5==0) {
            System.out.println("super sayi");
        } else if (sayi%5==0) {
            System.out.println("sayi 5 kati");
        }else if (sayi%3==0){
            System.out.println("sayi 3 kati");
        }
    }
}
