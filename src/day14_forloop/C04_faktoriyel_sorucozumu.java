package day14_forloop;

import java.util.Scanner;

public class C04_faktoriyel_sorucozumu {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 20 den kucuk bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();
        int faktorDegeri=1;
        for (int i = 1; i <=girilenSayi ; i++) {
            faktorDegeri*=i;

        }
        System.out.println("girilen sayinin faktoriyel degeri : "+faktorDegeri);
    }
}
